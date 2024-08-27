package org.chementsova.mvc_department_service.controller;

import org.chementsova.mvc_department_service.model.Department;
import org.chementsova.mvc_department_service.service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/get/all")
    public List<Department> getAllDepartments() {
        return departmentService.getAll();
    }

}
