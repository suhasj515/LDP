package com.spring.crud.crudDemo.dao;

import com.spring.crud.crudDemo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO{

    //define fields for entitymanger
    private EntityManager entityManager;

    //set up constructor injection
    @Autowired
    public EmployeeDAOHibernateImpl(EntityManager theEntityManager){
        entityManager=theEntityManager;
    }


    @Override
    public List<Employee> findAll() {

        //get current hibernate session
        Session currentSession= entityManager.unwrap(Session.class);

        //create a query
        Query<Employee> query= currentSession.createQuery("from Employee ",Employee.class);

        //execute the query
        List<Employee> employeeList=query.getResultList();

        return employeeList;
    }

    @Override
    public Employee getEmployee(int id){
        Session currentSession= entityManager.unwrap(Session.class);

        Employee employee=currentSession.get(Employee.class,id);

        return employee;
    }

    @Override
    public void save(Employee employee){
        Session session=entityManager.unwrap(Session.class);

        session.saveOrUpdate(employee);
    }

    @Override
    public void deleteEmployee(int id){
        Session currentSession=entityManager.unwrap(Session.class);

        Query theQuery =
                currentSession.createQuery("delete from Employee where id=:Id");
        theQuery.setParameter("Id", id);

        theQuery.executeUpdate();
    }
}
