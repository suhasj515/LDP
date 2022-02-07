package com.spring.aopdemo.aspect;


import com.spring.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Locale;

@Aspect
@Component
public class MyLogAccountList {


    @AfterReturning(pointcut = "execution(* com.spring.aopdemo.dao.AccountDAO.findAccounts(..))",returning = "result")
    public void logAccountsList(JoinPoint joinPoint, List<Account> result){

        //print out methods
        String method= joinPoint.getSignature().toString();
        System.out.println("+++++++++++Executing after returning from method"+method);

        //print out returened values
        System.out.println("+++++++++++Result is :"+result);

        //post-process the results
        //convert accounts to uper case
        convertNamestoUpperCase(result);


    }

    @AfterThrowing(pointcut = "execution(* com.spring.aopdemo.dao.AccountDAO.findAccounts(..))",throwing = "exe")
    public void interceptException(JoinPoint joinPoint,Throwable exe){
        //print out method
        System.out.println("Method "+joinPoint.getSignature().toString());
        System.out.println("Exception caught in ASpects "+exe);
    }


    //adding after advice
    @After("execution(* com.spring.aopdemo.dao.AccountDAO.findAccounts(..))") //even for success or failure
    public void afterFinally(JoinPoint joinPoint){
        //print out method
        System.out.println("Executing @After finally Method "+joinPoint.getSignature().toString());
        
    }

    private void convertNamestoUpperCase(List<Account> result) {
        for(Account tempAcc:result){
            tempAcc.setName(tempAcc.getName().toUpperCase());
        }

    }


}
