package org.example.exception;

public class EmployeeOnVacationException extends Exception {
    public EmployeeOnVacationException(int employeeId) {
        super("The employee " + employeeId + " is on vacation");
    }
}
