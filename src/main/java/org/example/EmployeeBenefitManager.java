package org.example;

import org.example.reporter.Reporter;
import org.example.reporter.ReporterFactory;

public class EmployeeBenefitManager {
    public static void main(String[] args) {
        ReporterFactory reporterFactory = new ReporterFactory();
        Reporter reporter = reporterFactory.getReporterByEmployeeId(1);
        System.out.print("total pay of " + reporter.employeeName() + " :" + reporter.salaries());
    }
}
