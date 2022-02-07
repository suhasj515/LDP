package com.spring.crud.crudDemo.service;

import com.spring.crud.crudDemo.dao.EmployeeDAO;
import com.spring.crud.crudDemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    @Qualifier("employeeDAOJpaImpl")  //bean id
    private EmployeeDAO employeeDAO;


    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    @Transactional
    public Employee getEmployee(int id)
    {
        return employeeDAO.getEmployee(id);
    }

    @Override
    @Transactional
    public void save(Employee employee)
    {
        employeeDAO.save(employee);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id){
        employeeDAO.deleteEmployee(id);
    }
}
