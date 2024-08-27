package org.chementsova.mvc_department_service.dto.mapping.utils;

import org.chementsova.mvc_department_service.dto.DepartmentDto;
import org.chementsova.mvc_department_service.model.Department;


public class DepartmentMapper {

    public static DepartmentDto toDepartmentDto(Department department) {
        DepartmentDto departmentDto = new DepartmentDto();
        departmentDto.setId(department.getId());
        departmentDto.setName(department.getName());
        departmentDto.setNeedOfEmployee(department.isNeedOfEmployee());
        return departmentDto;
    }

    public static Department toDepartment(DepartmentDto departmentDto) {
        Department department = new Department();
        department.setId(departmentDto.getId());
        department.setName(departmentDto.getName());
        department.setNeedOfEmployee(departmentDto.isNeedOfEmployee());
        return department;
    }
}
