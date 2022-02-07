package com.spring.springboot.ThyleafDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/hello")
    public String getHello(Model model){
        model.addAttribute("thedate",new java.util.Date());
        return "helloWorld";
    }

}
