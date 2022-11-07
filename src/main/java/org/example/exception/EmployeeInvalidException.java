package org.example.exception;

public class EmployeeInvalidException extends RuntimeException {
    public EmployeeInvalidException(Exception e) {
        super("Employee is invalid");
    }
}
