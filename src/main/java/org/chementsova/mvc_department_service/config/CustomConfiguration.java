package org.chementsova.mvc_department_service.config;

import org.chementsova.mvc_department_service.model.MyBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfiguration {

    @Bean(name = "MyFirstConfigurationBean")
    @ConditionalOnProperty (name = "config.create.bean", havingValue = "true")
    public MyBean createMyBean(){
        return new MyBean();
    }

}
