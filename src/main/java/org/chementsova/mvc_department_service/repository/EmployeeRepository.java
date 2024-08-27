package org.chementsova.mvc_department_service.repository;

import org.chementsova.mvc_department_service.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
