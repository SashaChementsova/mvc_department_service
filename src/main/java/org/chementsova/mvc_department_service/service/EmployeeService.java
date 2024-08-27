package org.chementsova.mvc_department_service.service;

import java.util.List;
import org.chementsova.mvc_department_service.model.Employee;

public interface EmployeeService {
    void save(Employee employee);

    List<Employee> getAll();

    Employee getById(int id);
}
