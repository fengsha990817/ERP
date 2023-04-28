package com.example.backend.entity;

public class RestBean<T> {
    private int status;
    private T message;
    private boolean success;

    private RestBean(){
    }

    private RestBean(int status, boolean success, T message) {
        this.status = status;
        this.message = message;
        this.success = success;
    }

    public static <T> RestBean<T> success(){
        return new RestBean<>(200, true, null);
    }
    public static <T> RestBean<T> success(T data){
        return new RestBean<>(200, true, data);
    }
    public static <T> RestBean<T> failure(int status){
        return new RestBean<>(status, false, null);
    }
    public static <T> RestBean<T> failure(int status, T data){
        return new RestBean<>(status, false, data);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getMessage() {
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
