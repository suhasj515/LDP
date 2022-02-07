package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class TennisCoach implements Coach{
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;


//    @Autowired  (Constructor injection)
//    TennisCoach(HappyFortuneService argshappyFortuneService){
//        happyFortuneService=argshappyFortuneService;
//    }

//    @Autowired  (Setter injection)
//    public void setHappyFortuneService(HappyFortuneService happyFortuneService){
//        this.happyFortuneService=happyFortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice serving ";
    }

    public String getDailyFortune(){
        return fortuneService.getFortune();
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Runs method post bean construct");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("Runs method pre bean destruct");
    }
}
