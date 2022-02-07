package com.ldp.springldp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args){
        //load config file
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean
        Coach theCoach= context.getBean("myCoach",Coach.class);

        //call method
        System.out.println(theCoach.getDailyWorkOut());

        //dependency injected methods (fortune)
        System.out.println(theCoach.getDailyFortune());

        //close context
        context.close();
    }
}
