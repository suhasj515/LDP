package com.spring.aopdemo.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyclassApiAnalytics {

    @Before("com.spring.aopdemo.aspect.AopExpressions.forDAOPackage()")
    public void apiAnalytics(){
        System.out.println(">>>>>>>>>>>performing api analytics");
    }
}
