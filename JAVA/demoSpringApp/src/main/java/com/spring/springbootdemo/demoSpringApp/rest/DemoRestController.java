package com.spring.springbootdemo.demoSpringApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.LocalTime;

@RestController
public class DemoRestController {

    @GetMapping("/")
    public String getTime(){
        return "Current time on server : "+ LocalDateTime.now();
    }
}
