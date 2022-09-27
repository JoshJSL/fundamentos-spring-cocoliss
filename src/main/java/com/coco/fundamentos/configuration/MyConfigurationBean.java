package com.coco.fundamentos.configuration;

import com.coco.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return new BeanImplementTwo();
    }

    @Bean
    public MyOperation beanOperationOp(){
        return new MyOperationImplement();
    }

    @Bean
    public MyBeanWithDependency beanOperationOpWDep(MyOperation myOperation){
        return new MyBeanWithDependencyImplement(myOperation);
    }
}
