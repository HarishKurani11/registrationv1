package com.api.exception;

public class ResponceNotFoundException extends RuntimeException{
    public ResponceNotFoundException(String message) {
        super(message);
    }
}
