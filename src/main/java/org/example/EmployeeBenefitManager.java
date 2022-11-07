package org.example;

import org.example.reporter.Reporter;
import org.example.reporter.ReporterFactory;

public class EmployeeBenefitManager {
    public static void main(String[] args) {
        ReporterFactory reporterFactory = new ReporterFactory();
        Reporter reporter = reporterFactory.getReporterByEmployeeId(1);
        reporter.printSalaries();
    }
}
