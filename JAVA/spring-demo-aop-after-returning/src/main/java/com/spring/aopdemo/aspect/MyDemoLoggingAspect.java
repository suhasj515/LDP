package com.spring.aopdemo.aspect;

import com.spring.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
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
    public void beforeAddAccount(JoinPoint joinPoint){

        System.out.println("\n>>>>>>>Executes before addAccount() method");

        //display method signature
        MethodSignature methodSignature= (MethodSignature) joinPoint.getSignature();
        System.out.println("-------Method sigature : "+methodSignature);

        //display method arguments
        Object[] args= joinPoint.getArgs();

        //print the args

        for(Object tempArg:args ){
            System.out.println(tempArg);

            if(tempArg instanceof Account){
                //downcast and print account specific stuff
                Account account=(Account) tempArg;

                System.out.println("ACcount name :"+ account.getName());
                System.out.println("Account data :"+account.getLevel());
            }
        }
    }




}
