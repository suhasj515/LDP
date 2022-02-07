package com.ldp.springldp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        //scope is singleton for the bean
        Coach myCoach=context.getBean("myCoach",Coach.class);
        Coach alphaCoach=context.getBean("myCoach",Coach.class);

        //check if both objects are same
        boolean ans=(myCoach==alphaCoach);
        System.out.println("Pointing to same object?: "+ans);
        //print memory location of both objects
        System.out.println("Memory of myCoach object: "+myCoach);
        System.out.println("Memory of alphaCoach object: "+alphaCoach);

        context.close();
    }
}
