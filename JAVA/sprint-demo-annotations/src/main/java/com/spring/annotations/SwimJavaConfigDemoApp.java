package com.spring.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String [] args){

        //read spring config java class
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportConfig.class);

        //get bean from spring container
        SwimCoach coach=context.getBean("swimCoach",SwimCoach.class);

        System.out.println(coach.getDailyWorkout());

        //dependency methods
        System.out.println(coach.getDailyFortune());

        //properties file injection from java code
        System.out.println("Email : "+coach.getEmail());
        System.out.println("Team : "+coach.getTeam());

        context.close();
    }
}
