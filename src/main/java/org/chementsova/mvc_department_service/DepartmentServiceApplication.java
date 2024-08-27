package org.chementsova.mvc_department_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DepartmentServiceApplication {

    public static ApplicationContext applicationContext;

    public static void main(String[] args) {

        applicationContext = SpringApplication.run(DepartmentServiceApplication.class, args);
    }

}
