package com.spring.springboot.ThyleafDemo.controller;

import com.spring.springboot.ThyleafDemo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    //load employee data
    private List<Employee> employeeList;

    @PostConstruct
    private void loadData(){

        Employee emp1=new Employee(1,"john","andrew","john@abc.com");
        Employee emp2=new Employee(2,"Philip","bruce","philip@abc.com");
        Employee emp3=new Employee(3,"mark","lei","mark@abc.com");

        employeeList= new ArrayList<>();

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
    }

    @GetMapping("/list")
    public String listEmployee(Model model){
        model.addAttribute("employees",employeeList);

        return "list-employees";
    }



    //add maping for /list
}

















