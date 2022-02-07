package com.spring.aopdemo.aspect;


import com.spring.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;

@Aspect
@Component
public class MyLogAccountList {
    Logger logger= Logger.getLogger(MyLogAccountList.class.getName());


    @AfterReturning(pointcut = "execution(* com.spring.aopdemo.dao.AccountDAO.findAccounts(..))",returning = "result")
    public void logAccountsList(JoinPoint joinPoint, List<Account> result){

        //print out methods
        String method= joinPoint.getSignature().toString();
        logger.info("+++++++++++Executing after returning from method"+method);

        //print out returened values
        logger.info("+++++++++++Result is :"+result);

        //post-process the results
        //convert accounts to uper case
        convertNamestoUpperCase(result);


    }

    @AfterThrowing(pointcut = "execution(* com.spring.aopdemo.dao.AccountDAO.findAccounts(..))",throwing = "exe")
    public void interceptException(JoinPoint joinPoint,Throwable exe){
        //print out method
        logger.info("Method "+joinPoint.getSignature().toString());
        logger.info("Exception caught in ASpects "+exe);
    }


    //adding after advice
    @After("execution(* com.spring.aopdemo.dao.AccountDAO.findAccounts(..))") //even for success or failure
    public void afterFinally(JoinPoint joinPoint){
        //print out method
        logger.info("Executing @After finally Method "+joinPoint.getSignature().toString());
        
    }

    //aroound
    @Around("execution(* com.spring.aopdemo.service.TrafficFortuneService.getFortune(..))")
    public Object aroundFortunate(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //print out method
        logger.info("Method "+proceedingJoinPoint.getSignature().toString());
        //get begin timestamp
        long begin=System.currentTimeMillis();

        Object result = null;
        //execute the method
        try {

            result = proceedingJoinPoint.proceed();
        }
        catch (Exception e){
            //log exception
            logger.warning(e.getMessage());

            result="Exception handled by aspect";
        }

        //get end timestamp
        long end=System.currentTimeMillis();

        //compute duration
        long duration=end-begin;
        logger.info("\n======= Duration: "+duration/1000.0+" secounds");
        return result;
    }

    private void convertNamestoUpperCase(List<Account> result) {
        for(Account tempAcc:result){
            tempAcc.setName(tempAcc.getName().toUpperCase());
        }

    }


}
