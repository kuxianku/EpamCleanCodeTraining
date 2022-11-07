package org.example.reporter;

import org.example.remote.ServiceWrapper;
import org.example.exception.EmployeeInvalidException;
import org.example.remote.MockService;
import org.example.remote.RemoteService;

public class ReporterFactory {
    public Reporter getReporterByEmployeeId(int id) {
        RemoteService remoteService = new MockService();
        ServiceWrapper wrapper = new ServiceWrapper(remoteService);
        Reporter reporter;
        try {
            reporter = new DailyReporter(wrapper.getEmployeeById(id));
        } catch (EmployeeInvalidException e) {
            reporter = new EmptyReporter();
        }
        return reporter;
    }
}
