package com.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String [] args){

        //read spring config file
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

        //get bean from spring comtainer
        Coach mycoach=context.getBean("tennisCoach",Coach.class);

        System.out.println(mycoach.getDailyWorkout());

        //dependency methods
        System.out.println(mycoach.getDailyFortune());

        context.close();
    }
}
