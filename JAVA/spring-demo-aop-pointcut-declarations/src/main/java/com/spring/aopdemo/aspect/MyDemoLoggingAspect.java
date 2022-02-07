package com.spring.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(0)
public class MyDemoLoggingAspect {

    //add all related advices for logging

//    //create a ponintcut expression
//    @Pointcut("execution(* com.spring.aopdemo.dao.*.*(..))")
//    private void forDAOPackage() {
//    }
//
//    //pointcut for getters and setters
//    @Pointcut("execution(* com.spring.aopdemo.dao.*.set*(..))")
//    private void setterPointcut(){}
//
//    @Pointcut("execution(* com.spring.aopdemo.dao.*.get*(..))")
//    private void getterPointcut(){}
//
//    // combining pointcut
//    @Pointcut("forDAOPackage() && !(getterPointcut() || setterPointcut())")
//    private void doaPackageExceptGetterSetterPointcut(){}

    @Before("com.spring.aopdemo.aspect.AopExpressions.doaPackageExceptGetterSetterPointcut()") //for methods in a package
    public void beforeAddAccount(){
        System.out.println("\n>>>>>>>Executes before addAccount() method");
    }




}
