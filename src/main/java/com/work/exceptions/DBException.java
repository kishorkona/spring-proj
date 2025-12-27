package com.work.exceptions;

import lombok.Data;

@Data
public class DBException extends RuntimeException {

    private String errorCode;
    
    public DBException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }
    public DBException(String errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

}
