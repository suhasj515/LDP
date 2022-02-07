package com.luv2code.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class CustomerRestExceptionHandler {

    //Exception handler for customer not found expcetion
    @ExceptionHandler
    public ResponseEntity<CustomerErrorResponse> customerNotFound(CustomerNotFoundException exe){

        CustomerErrorResponse customerErrorResponse= new CustomerErrorResponse();

        customerErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        customerErrorResponse.setMessage(exe.getMessage());
        customerErrorResponse.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(customerErrorResponse,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<CustomerErrorResponse> catchAllException(Exception exe){

        CustomerErrorResponse customerErrorResponse= new CustomerErrorResponse();

        customerErrorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        customerErrorResponse.setMessage(exe.getMessage());
        customerErrorResponse.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(customerErrorResponse,HttpStatus.BAD_REQUEST);
    }


}
