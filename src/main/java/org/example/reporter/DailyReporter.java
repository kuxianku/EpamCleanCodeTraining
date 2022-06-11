package org.example.reporter;

import org.example.dto.Employee;

public class DailyReporter extends Reporter {


    private final Employee employee;

    public DailyReporter(Employee employee) {
        this.employee = employee;
    }

    @Override
    public int employeeWorkHours() {
        return employee.employeeWorkRecords().workingHours();
    }

    @Override
    public int employeeNumOfMeals() {
        return employee.employeeWorkRecords().numberOfMeals();
    }

    @Override
    public String employeeName() {
        return null;
    }


}
