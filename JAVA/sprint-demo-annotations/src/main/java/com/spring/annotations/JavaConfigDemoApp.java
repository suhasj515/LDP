package com.spring.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String [] args){

        //read spring config java class
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportConfig.class);

        //get bean from spring container
        Coach coach=context.getBean("tennisCoach",Coach.class);

        System.out.println(coach.getDailyWorkout());

        //dependency methods
        System.out.println(coach.getDailyFortune());

        context.close();
    }
}
