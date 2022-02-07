package com.ldp.springldp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
        //scope is singleton for the bean
        Coach myCoach=context.getBean("myCoach",Coach.class);

        System.out.println(myCoach.getDailyWorkOut());

        context.close();
    }
}
