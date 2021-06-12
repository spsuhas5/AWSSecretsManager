package com.example.sample.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class CustomException extends RuntimeException {


    public CustomException() {

    }

    public CustomException(String message) {
        super(message);
    }
}
