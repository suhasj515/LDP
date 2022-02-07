package com.spring.annotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{

    public FortuneService fortuneService;

    @Value("${email}")
    private String email;

    public String getEmail() {
        return email;
    }

    @Value("${team}")
    private String team;

    public String getTeam() {
        return team;
    }

    public SwimCoach(FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Swim for 2 hrs";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
