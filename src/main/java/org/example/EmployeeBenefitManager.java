package org.example;

import org.example.exception.EmployeeInvalidException;
import org.example.remote.MockService;
import org.example.remote.RemoteService;
import org.example.reporter.DailyReporter;
import org.example.reporter.EmptyReporter;
import org.example.reporter.Reporter;

public class EmployeeBenefitManager {

    public static void main(String[] args) {
        RemoteService remoteService = new MockService();
        ServiceWrapper wrapper = new ServiceWrapper(remoteService);
        Reporter reporter;
        try {
            reporter = new DailyReporter(wrapper.getEmployeeById(5));
        } catch (EmployeeInvalidException e) {
            reporter = new EmptyReporter();
        }
        System.out.print("total pay:" + reporter.salaries());
    }
}
