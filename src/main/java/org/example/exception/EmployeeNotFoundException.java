package org.example.exception;

public class EmployeeNotFoundException extends Exception {
    public EmployeeNotFoundException(int employeeId) {
        super("No employees with Id of " + employeeId + " found");
    }
}
