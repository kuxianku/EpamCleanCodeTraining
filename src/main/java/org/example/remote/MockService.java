package org.example.remote;

import org.example.dto.Employee;
import org.example.dto.EmployeeWorkRecords;
import org.example.exception.EmployeeNotActiveException;
import org.example.exception.EmployeeOnVacationException;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MockService implements RemoteService {
    public static int ID_VACATION = 10;
    public static int ID_LEFT = 11;

    @Override
    public Employee getEmployeeById(int id) throws EmployeeOnVacationException, EmployeeNotActiveException {
        //mock exception
        if (id == ID_VACATION) {
            throw new EmployeeOnVacationException(id);
        }
        //mock exception
        if (id == ID_LEFT) {
            throw new EmployeeNotActiveException(id);
        }
        List<Employee> employees = generateMockEmployees();
        Optional<Employee> employ = employees
                .stream()
                .filter(employee -> employee.id() == id)
                .findFirst();
        if (employ.isEmpty()) {
            return null;
        } else {
            return employ.get();
        }
    }

    public List<Employee> generateMockEmployees() {
        return Stream.of(1, 2, 3)
                .map(this::generateMockEmployee)
                .collect(Collectors.toList());
    }

    private Employee generateMockEmployee(int id) {
        Random random = new Random();
        EmployeeWorkRecords employeeWorkRecords = new EmployeeWorkRecords(random.nextInt(8), random.nextInt(3));
        return new Employee("Mock" + id, id, employeeWorkRecords);
    }
}
