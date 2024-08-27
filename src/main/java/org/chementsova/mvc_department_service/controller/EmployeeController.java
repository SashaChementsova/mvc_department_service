package org.chementsova.mvc_department_service.controller;

import org.chementsova.mvc_department_service.model.Employee;
import org.chementsova.mvc_department_service.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/get/all")
    public List<Employee> getAllEmployees() {
        return employeeService.getAll();
    }

}
