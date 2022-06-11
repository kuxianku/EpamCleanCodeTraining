package org.example.reporter;

import org.example.dto.Employee;
import org.example.exception.EmployeeNotActiveException;
import org.example.exception.EmployeeOnVacationException;
import org.example.remote.MockService;
import org.example.remote.RemoteService;

public class DailyReporter {

    public static int HOURLY_RATE = 60;
    public static int MEALS_PER_DIEM = 10;

    private final RemoteService remoteService;

    private Employee employee;

    private final int id;

    public DailyReporter(int id) {
        remoteService = new MockService();
        this.id = id;
    }

    public Employee getEmployee() {
        if (employee == null) {
            try {
                employee = remoteService.getEmployeeById(id);
                return employee;
            } catch (EmployeeOnVacationException e) {
                return null;
            } catch (EmployeeNotActiveException e) {
                return null;
            }
        } else {
            return employee;
        }
    }

    public int salaries() {
        if (getEmployee() == null) return 0;
        return (getEmployee().employeeWorkRecords().workingHours() * MEALS_PER_DIEM)
                + (getEmployee().employeeWorkRecords().numberOfMeals() * HOURLY_RATE);
    }

}
