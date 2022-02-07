package com.spring.crud.crudDemo.service;

import com.spring.crud.crudDemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll();

    public Employee getEmployee(int id);
    public void save(Employee employee);

    public void deleteEmployee(int id);
}
