package com.ldp.springldp;

public class FortuneServiceLucky implements Fortune{

    @Override
    public String getFortune() {
        return "Today is a lucky day for spring dependency injection";
    }
}
