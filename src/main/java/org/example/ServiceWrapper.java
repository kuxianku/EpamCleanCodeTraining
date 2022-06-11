package org.example;

import org.example.dto.Employee;
import org.example.exception.EmployeeInvalidException;
import org.example.exception.EmployeeNotActiveException;
import org.example.exception.EmployeeNotFoundException;
import org.example.exception.EmployeeOnVacationException;
import org.example.remote.RemoteService;

public class ServiceWrapper {
    private final RemoteService remoteService;

    public ServiceWrapper(RemoteService remoteService) {
        this.remoteService = remoteService;
    }

    Employee getEmployeeById(int id) {
        try {
            return remoteService.getEmployeeById(id);
        } catch (EmployeeNotActiveException | EmployeeOnVacationException | EmployeeNotFoundException e) {
            throw new EmployeeInvalidException(e);
        }
    }
}
