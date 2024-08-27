package org.chementsova.mvc_department_service.controller;

import org.chementsova.mvc_department_service.DepartmentServiceApplication;
import org.chementsova.mvc_department_service.model.MyBean;
import org.chementsova.mvc_department_service.service.MyBeanService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bean")
public class MyBeanController {

    private final MyBeanService myBeanService;

    public MyBeanController(MyBeanService myBeanService) {
        this.myBeanService = myBeanService;
    }

    @GetMapping("/get")
    public String getMyBean() {
        return myBeanService.getMyBeanInfo();
    }
}
