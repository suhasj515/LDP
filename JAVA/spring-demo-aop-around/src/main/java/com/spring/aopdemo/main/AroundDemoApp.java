package com.spring.aopdemo.main;

import com.spring.aopdemo.Account;
import com.spring.aopdemo.dao.AccountDAO;
import com.spring.aopdemo.dao.MembershipDAO;
import com.spring.aopdemo.service.TrafficFortuneService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AroundDemoApp {

    public static void main(String args[]) throws InterruptedException {
        //read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);


        //get bean from spring container
        TrafficFortuneService trafficFortuneService= context.getBean("trafficFortuneService",TrafficFortuneService.class);

        //calling fortune service
        String data=trafficFortuneService.getFortune();
        System.out.println("Main program calling fortune service:"+data);




        //close the context
        context.close();
    }
}
