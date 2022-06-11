package org.example.reporter;

import org.example.dto.Employee;

import java.security.PublicKey;

public class DailyReporter extends Reporter {


    private final Employee employee;

    public DailyReporter(Employee employee) {
        this.employee = employee;
    }

    @Override
    public int employeeWorkHours() {
        return employee.getEmployeeWorkRecords().getWorkingHours();
    }

    @Override
    public int employeeNumOfMeals() {
        return employee.getEmployeeWorkRecords().getNumberOfMeals();
    }


}
