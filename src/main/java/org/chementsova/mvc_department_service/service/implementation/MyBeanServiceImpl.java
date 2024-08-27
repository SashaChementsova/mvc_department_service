package org.chementsova.mvc_department_service.service.implementation;

import org.chementsova.mvc_department_service.DepartmentServiceApplication;
import org.chementsova.mvc_department_service.model.MyBean;
import org.chementsova.mvc_department_service.service.MyBeanService;
import org.springframework.stereotype.Service;

@Service
public class MyBeanServiceImpl implements MyBeanService {

    @Override
    public String getMyBeanInfo(){
        MyBean myBean = DepartmentServiceApplication.applicationContext.getBean(MyBean.class);
        return myBean.printInfo();
    }

}
