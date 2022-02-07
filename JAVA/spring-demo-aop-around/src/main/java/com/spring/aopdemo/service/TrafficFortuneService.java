package com.spring.aopdemo.service;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;
@Component
public class TrafficFortuneService {

    public String getFortune() throws InterruptedException {

        //simulate a delay
        TimeUnit.SECONDS.sleep(5);

        //return a fortune
        return "heavy traffic for today";
    }

    public String getFortune(boolean throwException) throws InterruptedException {
        if(throwException){
            throw new RuntimeException("Runtime expcepition raised");
        }
        return getFortune();
    }
}
