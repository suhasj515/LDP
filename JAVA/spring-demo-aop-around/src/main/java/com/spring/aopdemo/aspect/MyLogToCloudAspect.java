package com.spring.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyLogToCloudAspect {

    @Before("com.spring.aopdemo.aspect.AopExpressions.forDAOPackage()")
    public void logToCloud(){
        System.out.println(">>>>>>>>>>performing logs to cloud");
    }
}
