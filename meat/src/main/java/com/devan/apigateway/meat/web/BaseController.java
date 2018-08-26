package com.devan.apigateway.meat.web;

import javassist.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class BaseController {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity notFound(){

        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity illegal(){

        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

}
