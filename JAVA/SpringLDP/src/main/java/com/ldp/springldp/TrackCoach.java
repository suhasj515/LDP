package com.ldp.springldp;

public class TrackCoach implements Coach {

    private FortuneServiceLucky fortuneServiceLucky;

    TrackCoach(FortuneServiceLucky fortuneServiceLuckyParams){
        fortuneServiceLucky=fortuneServiceLuckyParams;

    }

    @Override
    public String getDailyWorkOut() {
        return "Run 5k  ";
    }

    @Override
    public String getDailyFortune() {
        return "From track coach"+ fortuneServiceLucky.getFortune();
    }

    //init method custom hooks
    public void initMethodBean(){
        System.out.println("Runs during initialization of bean");
    }

    //destroy method custom hooks
    public void destroyMethodBean(){
        System.out.println("Runs during destruction of bean");
    }

}
