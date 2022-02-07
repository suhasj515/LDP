package com.spring.springboot.ThyleafDemo.controller;


import com.spring.springboot.ThyleafDemo.entity.Employee;
import com.spring.springboot.ThyleafDemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/list")
    public String listEmployee(Model model){
        List<Employee> employeeList= employeeService.findAll();
        model.addAttribute("Employee",employeeList);

        return "Employees/list-employees";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model){

        Employee employee= new Employee();
        model.addAttribute("Employee",employee);
        return "Employees/employee-form";

    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("Employee") Employee employee){
        employeeService.save(employee);

        //redirect to tables page
        return "redirect:/employees/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForAdd(@RequestParam("employeeId") int id,Model model){

        //get employee from service
        Optional<Employee> employee=employeeService.findById(id);
        //set employee to model attribute
        model.addAttribute("Employee",employee);

        return "Employees/employee-form";

    }
}

















