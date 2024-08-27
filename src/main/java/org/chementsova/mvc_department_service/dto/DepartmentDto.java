package org.chementsova.mvc_department_service.dto;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DepartmentDto {

    private int id;

    private String name;

    private boolean needOfEmployee;

    private List<EmployeeDto> employeesDto;

    public void addEmployee(EmployeeDto employee) {
        this.employeesDto.add(employee);
    }

    public void removeEmployee(EmployeeDto employee) {
        this.employeesDto.remove(employee);
    }

    public DepartmentDto(String name, boolean needOfEmployee) {
        this.name = name;
        this.needOfEmployee = needOfEmployee;
    }

    public DepartmentDto(String name, boolean needOfEmployee, List<EmployeeDto> employeesDto) {
        this.name = name;
        this.needOfEmployee = needOfEmployee;
        this.employeesDto = employeesDto;
    }
}
