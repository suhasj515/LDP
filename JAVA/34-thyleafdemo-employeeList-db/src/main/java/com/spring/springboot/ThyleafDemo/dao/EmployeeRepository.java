package com.spring.springboot.ThyleafDemo.dao;

import com.spring.springboot.ThyleafDemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

        //add method to sort by last name automatically creats query
    public List<Employee> findAllByOrderByLastNameAsc();
}
