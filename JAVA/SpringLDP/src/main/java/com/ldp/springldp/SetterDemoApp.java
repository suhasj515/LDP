package com.ldp.springldp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args){

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        CricketCoach myCoach= context.getBean("myCricketCoach",CricketCoach.class);

        //setter dependency injection
        System.out.println(myCoach.getDailyWorkOut());
        System.out.println(myCoach.getDailyFortune());

        //calling literal value injected methods
        System.out.println(myCoach.getEmailAddress());
        System.out.println(myCoach.getTeam());

        context.close();
    }
}
