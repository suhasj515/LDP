package com.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnotationBeanScopeDemoApp {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context=new
                ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach= context.getBean("tennisCoach",Coach.class);
        Coach alphaCoach= context.getBean("tennisCoach",Coach.class);

        boolean result=(theCoach==alphaCoach);
        System.out.println("Pointing to same object ?: "+result);

        System.out.println("Memory for theCoach: "+theCoach);
        System.out.println("Memory for alphaCoach: "+alphaCoach);

        context.close();

    }
}
