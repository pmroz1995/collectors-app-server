package com.example.collectorsApp.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class StampNotFoundException extends RuntimeException{

    public StampNotFoundException(String message) {
        super(message);
    }
}