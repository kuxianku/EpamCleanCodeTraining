package org.example.exception;

public class EmployeeNotActiveException extends Exception {
    public EmployeeNotActiveException(int employeeId) {
        super("Employee " + employeeId + " has left");
    }
}
