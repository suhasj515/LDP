package com.spring.crud.crudDemo.rest;

import com.spring.crud.crudDemo.dao.EmployeeDAO;
import com.spring.crud.crudDemo.entity.Employee;
import com.spring.crud.crudDemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    //inject employee service
    @Autowired
    private EmployeeService employeeService;


    //expose "/employees" to get all list of employees
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.findAll();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable int id){
        return employeeService.getEmployee(id);
    }

    @PostMapping("/employee")
    public Employee setEmployee(@RequestBody Employee employee){
        employee.setId(0);
        employeeService.save(employee);
        return employee;
    }

    @PatchMapping("/employee")
    public Employee updateEployee(@RequestBody Employee employee){
        employeeService.save(employee);
        return employee;
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployee(id);

        return "Deleted employee successfully :"+id;
    }

}
