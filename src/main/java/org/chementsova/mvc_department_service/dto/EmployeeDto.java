package org.chementsova.mvc_department_service.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeeDto {

    private int id;

    private String name;

    private int office;

    private String phone;

    private DepartmentDto departmentDto;

    public EmployeeDto(String name, int office, String phone) {
        this.name = name;
        this.office = office;
        this.phone = phone;
    }

    public EmployeeDto(String name, int office, String phone, DepartmentDto departmentDto) {
        this.name = name;
        this.office = office;
        this.phone = phone;
        this.departmentDto = departmentDto;
    }
}
