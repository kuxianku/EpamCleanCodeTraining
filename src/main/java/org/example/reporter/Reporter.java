package org.example.reporter;

public abstract class Reporter {

    public static int HOURLY_RATE = 60;
    public static int MEALS_PER_DIEM = 10;


    public abstract int employeeWorkHours();

    public abstract int employeeNumOfMeals();

    public abstract String employeeName();

    public int salaries() {
        return (employeeNumOfMeals() * MEALS_PER_DIEM) + (employeeWorkHours() * HOURLY_RATE);
    }

    public void printSalaries() {
        System.out.print("total pay of " + employeeName() + " :" + salaries());
    }
}
