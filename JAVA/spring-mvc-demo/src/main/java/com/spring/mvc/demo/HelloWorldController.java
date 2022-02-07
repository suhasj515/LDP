package com.spring.mvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    //need a controller method to show initial form
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    //controller method to process the form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    //new controller method to read form data and add data to model
    @RequestMapping("/processForm2")
    public String addModel(HttpServletRequest request, Model model){
        String name=request.getParameter("studentName");
        name=name.toUpperCase(Locale.ROOT);
        model.addAttribute("message","Hi "+name);
        return "helloworld";
    }

    @RequestMapping("/processForm3")
    public String addModelRequestParam(@RequestParam("studentName") String name, Model model){
        name=name.toUpperCase(Locale.ROOT);
        model.addAttribute("message","Hi "+name);
        return "helloworld";
    }
}
