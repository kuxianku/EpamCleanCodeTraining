package org.example.remote;

import org.example.dto.Employee;
import org.example.exception.EmployeeInvalidException;
import org.example.exception.EmployeeNotActiveException;
import org.example.exception.EmployeeNotFoundException;
import org.example.exception.EmployeeOnVacationException;

public class ServiceWrapper {
    private final RemoteService remoteService;

    public ServiceWrapper(RemoteService remoteService) {
        this.remoteService = remoteService;
    }

    public Employee getEmployeeById(int id) {
        try {
            return remoteService.getEmployeeById(id);
        } catch (EmployeeNotActiveException | EmployeeOnVacationException | EmployeeNotFoundException e) {
            throw new EmployeeInvalidException(e);
        }
    }
}
