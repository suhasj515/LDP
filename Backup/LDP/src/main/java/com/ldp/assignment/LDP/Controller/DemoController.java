package com.ldp.assignment.LDP.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String hello(){
        return "hello";
    }
}
