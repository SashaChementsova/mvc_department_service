package org.chementsova.mvc_department_service.service;

import org.chementsova.mvc_department_service.model.Department;
import org.chementsova.mvc_department_service.model.Employee;
import java.util.List;

public interface DepartmentService {
    void save(Department department);

    List<Department> getAll();

    Department getById(int id);

    void update(Department department, Employee employee);
}
