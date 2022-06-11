package org.example.reporter;

public class EmptyReporter extends Reporter {
    @Override
    public int employeeWorkHours() {
        return 0;
    }

    @Override
    public int employeeNumOfMeals() {
        return 0;
    }

    @Override
    public String employeeName() {
        return "";
    }
}
