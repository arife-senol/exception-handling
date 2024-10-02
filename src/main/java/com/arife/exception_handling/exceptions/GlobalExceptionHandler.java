package com.arife.exception_handling.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(StudentException.class)
    public ResponseEntity<StudentErrorResponse> handleException(StudentException studentException) {
        StudentErrorResponse studentErrorResponse = new StudentErrorResponse(studentException.getHttpStatus().value(), studentException.getMessage(), System.currentTimeMillis());

        return new ResponseEntity<>(studentErrorResponse, studentException.getHttpStatus());
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception exception) {
        StudentErrorResponse studentErrorResponse = new StudentErrorResponse(HttpStatus.NOT_FOUND.value(), exception.getMessage(), System.currentTimeMillis());

        return new ResponseEntity<>(studentErrorResponse, HttpStatus.NOT_FOUND);
    }
}
