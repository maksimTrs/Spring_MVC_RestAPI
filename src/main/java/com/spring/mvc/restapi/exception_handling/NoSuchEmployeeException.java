package com.spring.mvc.restapi.exception_handling;

public class NoSuchEmployeeException extends RuntimeException {
    public NoSuchEmployeeException(String message) {
        super("<<<<< "  + message  + " >>>>>");
    }
}
