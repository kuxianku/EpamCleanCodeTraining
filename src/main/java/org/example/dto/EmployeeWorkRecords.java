package org.example.dto;

public class EmployeeWorkRecords {
    private int workingHours;
    private int numberOfMeals;


    public EmployeeWorkRecords(int workingHours, int numberOfMeals) {
        this.workingHours = workingHours;
        this.numberOfMeals = numberOfMeals;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public int getNumberOfMeals() {
        return numberOfMeals;
    }

    public void setNumberOfMeals(int numberOfMeals) {
        this.numberOfMeals = numberOfMeals;
    }

}
