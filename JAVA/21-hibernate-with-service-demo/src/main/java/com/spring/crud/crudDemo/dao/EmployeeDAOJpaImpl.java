package com.spring.crud.crudDemo.dao;

import com.spring.crud.crudDemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{

    @Autowired
    private EntityManager manager;
    @Override
    public List<Employee> findAll() {
        //create a query
        Query query= manager.createQuery("from Employee");
        List<Employee> employeeList= query.getResultList();
        return  employeeList;
    }

    @Override
    public Employee getEmployee(int id) {
        Employee employee= manager.find(Employee.class,id);
        return  employee;
    }

    @Override
    public void save(Employee employee) {

        Employee dbEmployee= manager.merge(employee);

        employee.setId(dbEmployee.getId());

    }

    @Override
    public void deleteEmployee(int id) {
        //delete obj with primary key
        Query query=manager.createQuery("delete from  Employee where id=:empId");
        query.setParameter("empId",id);
        query.executeUpdate();
    }
}
