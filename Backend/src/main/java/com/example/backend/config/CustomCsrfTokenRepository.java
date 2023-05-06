package com.example.backend.config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.security.web.csrf.CsrfTokenRepository;

import java.util.Collection;
import java.util.UUID;

import jakarta.servlet.http.Cookie;

import org.springframework.security.web.csrf.DefaultCsrfToken;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.web.util.WebUtils;

import static com.example.backend.config.SecurityConfig.addSameSiteCookieAttribute;

public final class CustomCsrfTokenRepository implements CsrfTokenRepository {
    static final String DEFAULT_CSRF_COOKIE_NAME = "XSRF-TOKEN";

    static final String DEFAULT_CSRF_PARAMETER_NAME = "_csrf";

    static final String DEFAULT_CSRF_HEADER_NAME = "X-XSRF-TOKEN";

    private static final String CSRF_TOKEN_REMOVED_ATTRIBUTE_NAME = CookieCsrfTokenRepository.class.getName()
            .concat(".REMOVED");

    private String parameterName = DEFAULT_CSRF_PARAMETER_NAME;

    private String headerName = DEFAULT_CSRF_HEADER_NAME;

    private String cookieName = DEFAULT_CSRF_COOKIE_NAME;

    private boolean cookieHttpOnly = true;

    private String cookiePath;

    private String cookieDomain;

    private Boolean secure;

    private int cookieMaxAge = -1;
    @Override
    public CsrfToken generateToken(HttpServletRequest request) {
        return new DefaultCsrfToken(this.headerName, this.parameterName, createNewToken());
    }

    @Override
    public void saveToken(CsrfToken token, HttpServletRequest request, HttpServletResponse response) {
        String tokenValue = (token != null) ? token.getToken() : "";
        Cookie cookie = new Cookie(this.cookieName, tokenValue);
        cookie.setSecure((this.secure != null) ? this.secure : request.isSecure());
        cookie.setPath(StringUtils.hasLength(this.cookiePath) ? this.cookiePath : this.getRequestContext(request));
        cookie.setMaxAge((token != null) ? this.cookieMaxAge : 0);
        cookie.setHttpOnly(this.cookieHttpOnly);
        if (StringUtils.hasLength(this.cookieDomain)) {
            cookie.setDomain(this.cookieDomain);
        }
        response.addCookie(cookie);

        addSameSiteCookieAttribute(response);

        if (!StringUtils.hasLength(tokenValue)) {
            request.setAttribute(CSRF_TOKEN_REMOVED_ATTRIBUTE_NAME, Boolean.TRUE);
        }
        else {
            request.removeAttribute(CSRF_TOKEN_REMOVED_ATTRIBUTE_NAME);
        }
    }

    @Override
    public CsrfToken loadToken(HttpServletRequest request) {
        if (Boolean.TRUE.equals(request.getAttribute(CSRF_TOKEN_REMOVED_ATTRIBUTE_NAME))) {
            return null;
        }
        Cookie cookie = WebUtils.getCookie(request, this.cookieName);
        if (cookie == null) {
            return null;
        }
        String token = cookie.getValue();
        if (!StringUtils.hasLength(token)) {
            return null;
        }
        return new DefaultCsrfToken(this.headerName, this.parameterName, token);
    }
    public void setParameterName(String parameterName) {
        Assert.notNull(parameterName, "parameterName cannot be null");
        this.parameterName = parameterName;
    }

    public void setHeaderName(String headerName) {
        Assert.notNull(headerName, "headerName cannot be null");
        this.headerName = headerName;
    }

    public void setCookieName(String cookieName) {
        Assert.notNull(cookieName, "cookieName cannot be null");
        this.cookieName = cookieName;
    }

    public void setCookieHttpOnly(boolean cookieHttpOnly) {
        this.cookieHttpOnly = cookieHttpOnly;
    }

    private String getRequestContext(HttpServletRequest request) {
        String contextPath = request.getContextPath();
        return (contextPath.length() > 0) ? contextPath : "/";
    }

    public static CsrfTokenRepository withHttpOnlyFalse() {
        CustomCsrfTokenRepository result = new CustomCsrfTokenRepository();
        result.setCookieHttpOnly(false);
        return result;
    }

    private String createNewToken() {
        return UUID.randomUUID().toString();
    }

    public void setCookiePath(String path) {
        this.cookiePath = path;
    }

    public String getCookiePath() {
        return this.cookiePath;
    }


    public void setCookieDomain(String cookieDomain) {
        this.cookieDomain = cookieDomain;
    }

    public void setSecure(Boolean secure) {
        this.secure = secure;
    }

    public void setCookieMaxAge(int cookieMaxAge) {
        Assert.isTrue(cookieMaxAge != 0, "cookieMaxAge cannot be zero");
        this.cookieMaxAge = cookieMaxAge;
    }
}
