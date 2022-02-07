package com.spring.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    //add all related advices for logging

    //@before advice
    //@Before("execution(public * add*(com.spring.aopdemo.Account,..))") //pointcut expression
    //@Before("execution(* add*(..))") //any method starting with word add and params
    @Before("execution(* com.spring.aopdemo.dao.*.*(..))") //for methods in a package
    public void beforeAddAccount(){
        System.out.println("\nExecutes before addAccount() method");
    }



}
