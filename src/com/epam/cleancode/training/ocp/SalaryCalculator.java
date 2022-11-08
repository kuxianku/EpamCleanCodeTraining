package com.epam.cleancode.training.ocp;

class SalaryCalculator {
    public int calculateSalary(Employee employee) {
        // do something first ...

        int taxDeduction = calculateTax(employee);

        // do something again...

        return 100;
    }

    private int calculateTax(Employee employee) {
        switch (employee.getType()) {
            case "FULL_TIME":
                return 10;
            case "CONTRACTOR":
                return 5;
            default:
                return 0;
        }
    }
}