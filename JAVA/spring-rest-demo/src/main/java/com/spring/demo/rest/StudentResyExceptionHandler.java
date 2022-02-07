package com.spring.demo.rest;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentResyExceptionHandler {

    //add exception handling code
    //add exception handler

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exe)
    {
        //create student error response
        StudentErrorResponse errorResponse=new StudentErrorResponse();

        errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        errorResponse.setMessage(exe.getMessage());
        errorResponse.setTimeStamp(System.currentTimeMillis());

        //return response entity
        return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
    }

    //add another exception handler .. to catch any exception
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception exe)
    {
        //create student error response
        StudentErrorResponse errorResponse=new StudentErrorResponse();

        errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        errorResponse.setMessage(exe.getMessage());
        errorResponse.setTimeStamp(System.currentTimeMillis());

        //return response entity
        return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
    }
}
