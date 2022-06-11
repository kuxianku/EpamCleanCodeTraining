package org.example.reporter;

public abstract class Reporter {

    public static int HOURLY_RATE = 60;
    public static int MEALS_PER_DIEM = 10;

    abstract int employeeWorkHours();

    abstract int employeeNumOfMeals();

    public int salaries() {
        return (employeeNumOfMeals() * MEALS_PER_DIEM) + (employeeWorkHours() * HOURLY_RATE);
    }
}
