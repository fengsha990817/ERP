package com.example.backend.entity;

import java.io.Serializable;

public class LoginResponseEntity implements Serializable {
    private String message;
    private String role;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public static LoginResponseEntity getInstance(String message, String role){
        LoginResponseEntity entity = new LoginResponseEntity();
        entity.message = message;
        entity.role = role;
        return entity;
    }
}
