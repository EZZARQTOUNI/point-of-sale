package com.jwt.pfe.exception;


public class CustomException extends RuntimeException{
    private final String errorMessage;
    private final int code;


    public CustomException(String error, int code) {
        this.errorMessage = error;
        this.code = code;
    }


    public String getErrorMessage() {
        return errorMessage;
    }


    public int getCode() {
        return code;
    }

}
