package com.arife.exception_handling.exceptions;

import lombok.Data;

@Data
public class StudentErrorResponse {
    private int statusCode;
    private String message;
    private long timestamp;
    public StudentErrorResponse(int statusCode, String message, long timestamp) {
        this.statusCode = statusCode;
        this.message = message;
        this.timestamp = timestamp;
    }
}
