package org.example.dto;

public class Employee {
    private final String name;
    private final int id;
    private final EmployeeWorkRecords employeeWorkRecords;

    public Employee(String name, int id, EmployeeWorkRecords employeeWorkRecords) {
        this.name = name;
        this.id = id;
        this.employeeWorkRecords = employeeWorkRecords;
    }

    public int getId() {
        return id;
    }

    public EmployeeWorkRecords getEmployeeWorkRecords() {
        return employeeWorkRecords;
    }

    public String getName() {
        return name;
    }
}
