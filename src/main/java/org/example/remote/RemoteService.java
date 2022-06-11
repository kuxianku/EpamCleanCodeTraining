package org.example.remote;

import org.example.dto.Employee;
import org.example.exception.EmployeeNotActiveException;
import org.example.exception.EmployeeOnVacationException;

public interface RemoteService {
    Employee getEmployeeById(int id) throws EmployeeOnVacationException, EmployeeNotActiveException;
}
