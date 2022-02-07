package com.spring.crud.crudDemo.service;


import com.spring.crud.crudDemo.dao.EmployeeRepository;
import com.spring.crud.crudDemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

//    @Autowired
//    @Qualifier("employeeDAOJpaImpl")  //bean id
//    private EmployeeDAO employeeDAO;

    @Autowired
    EmployeeRepository employeeRepository;


    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    @Transactional
    public Optional<Employee> findById(int id)
    {
        return employeeRepository.findById(id);
    }

    @Override
    @Transactional
    public void save(Employee employee)
    {
        employeeRepository.save(employee);
    }

    @Override
    @Transactional
    public void deleteById(int id){
        employeeRepository.deleteById(id);
    }
}
