package org.chementsova.mvc_department_service.service.implementation;

import org.chementsova.mvc_department_service.model.Department;
import org.chementsova.mvc_department_service.model.Employee;
import org.chementsova.mvc_department_service.repository.DepartmentRepository;
import org.chementsova.mvc_department_service.service.DepartmentService;
import org.chementsova.mvc_department_service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@PropertySource("classpath://../update.properties")
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    private final EmployeeService employeeService;

    @Value("${db.status_of_update_department}")
    private String statusOfUpdateDepartment;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository, EmployeeService employeeService) {
        this.departmentRepository = departmentRepository;
        this.employeeService = employeeService;
    }

    @Override
    public void save(Department department) {
        departmentRepository.save(department);
    }

    @Override
    public List<Department> getAll() {
        return (List<Department>) departmentRepository.findAll();
    }

    @Override
    public Department getById(int id) {
        return departmentRepository.findById(id).get();
    }

    @Override
    public void update(Department department, Employee employee) {
        try {
            if (statusOfUpdateDepartment.equals("true")) {
                if(department.isNeedOfEmployee()){
                    employee.setDepartment(department);
                    employeeService.save(employee);
                    department.setNeedOfEmployee(false);
                }
                departmentRepository.save(department);
            } else {
                throw new Exception("Status of Department Update is false");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
