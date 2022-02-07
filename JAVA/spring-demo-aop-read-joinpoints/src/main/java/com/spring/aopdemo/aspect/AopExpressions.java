package com.spring.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpressions {
    @Pointcut("execution(* com.spring.aopdemo.dao.*.*(..))")
    public void forDAOPackage() {
    }

    //pointcut for getters and setters
    @Pointcut("execution(* com.spring.aopdemo.dao.*.set*(..))")
    public void setterPointcut(){}

    @Pointcut("execution(* com.spring.aopdemo.dao.*.get*(..))")
    public void getterPointcut(){}

    // combining pointcut
    @Pointcut("forDAOPackage() && !(getterPointcut() || setterPointcut())")
    public void doaPackageExceptGetterSetterPointcut(){}
}
