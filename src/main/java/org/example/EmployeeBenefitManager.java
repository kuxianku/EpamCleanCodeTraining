package org.example;

import org.example.reporter.DailyReporter;

public class EmployeeBenefitManager {

    public static void main(String[] args) {
        DailyReporter dailyReporter = new DailyReporter(5);

        String name = dailyReporter.getEmployee().name();

        System.out.print("salaries of " + name + " is " + dailyReporter.salaries());


    }
}
