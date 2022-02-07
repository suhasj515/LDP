package com.spring.springbootdemo.demoSpringApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.LocalTime;

@RestController
public class DemoRestController {

    //inject from properties file
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String getTime(){
        return "Current time on server : "+ LocalDateTime.now();
    }

    @GetMapping("/teaminfo")
    public String getTeamName(){
        return "Coach "+coachName+" is playing for "+teamName;
    }

    //expose new endpoint for "worlout"

    @GetMapping("/workout")
    public String getWorkout(){
        return "Workout daily";
    }
    @GetMapping("/fortune")
    public String getFortune(){
        return "lucky day ";
    }
}
