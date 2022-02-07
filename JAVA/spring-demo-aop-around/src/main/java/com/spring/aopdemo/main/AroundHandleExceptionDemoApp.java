package com.spring.aopdemo.main;

import com.spring.aopdemo.service.TrafficFortuneService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class AroundHandleExceptionDemoApp {

    public static void main(String args[]) throws InterruptedException {

        Logger logger= Logger.getLogger(AroundHandleExceptionDemoApp.class.getName());
        //read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);


        //get bean from spring container
        TrafficFortuneService trafficFortuneService= context.getBean("trafficFortuneService",TrafficFortuneService.class);

        //calling fortune service
        boolean throwException=true;
        String data=trafficFortuneService.getFortune(throwException);
        logger.info("Main program calling fortune service:"+data);




        //close the context
        context.close();
    }
}
