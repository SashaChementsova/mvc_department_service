package org.chementsova.mvc_department_service.dto.mapping.utils;

import org.chementsova.mvc_department_service.dto.EmployeeDto;
import org.chementsova.mvc_department_service.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeMapper {

    public static EmployeeDto toEmployeeDto(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setName(employee.getName());
        employeeDto.setOffice(employee.getOffice());
        employeeDto.setPhone(employee.getPhone());
        ///////////////////////////
        return employeeDto;
    }

    public static Employee toEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setId(employeeDto.getId());
        employee.setName(employeeDto.getName());
        employee.setOffice(employeeDto.getOffice());
        employee.setPhone(employeeDto.getPhone());
        //////////////////////
        return employee;
    }
}
