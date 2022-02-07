package com.ldp.springldp;

public class BaseBallCoach implements Coach {

    private FortuneServiceLucky fortuneService;
    BaseBallCoach(FortuneServiceLucky fortuneServiceParams){
        fortuneService=fortuneServiceParams;
    }




    @Override
    public String getDailyWorkOut(){
        return "Spend 30 min on baseball batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
