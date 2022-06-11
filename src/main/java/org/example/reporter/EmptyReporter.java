package org.example.reporter;

public class EmptyReporter extends Reporter {
    @Override
    public int employeeWorkHours() {
        return 0;
    }

    @Override
    int employeeNumOfMeals() {
        return 0;
    }
}
