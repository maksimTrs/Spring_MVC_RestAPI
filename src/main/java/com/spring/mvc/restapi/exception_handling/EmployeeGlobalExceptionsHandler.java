package com.spring.mvc.restapi.exception_handling;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class EmployeeGlobalExceptionsHandler {

    @ExceptionHandler
    public ResponseEntity<EmployeeErrorHandling> handleWrongEmpIdException(NoSuchEmployeeException exception) {
        EmployeeErrorHandling data = new EmployeeErrorHandling();

        data.setInfo(exception.getMessage());
        data.setDateTime(String.valueOf(LocalDateTime.now()));

        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<EmployeeErrorHandling> handleAllExceptions(Exception exception) {
        EmployeeErrorHandling data = new EmployeeErrorHandling();

        data.setInfo(exception.getMessage());
        data.setDateTime(String.valueOf(LocalDateTime.now()));

        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
    }
}
