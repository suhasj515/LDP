package com.spring.hibernate.demo;

import com.spring.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {

    public static void main(String[] args){

        //create session factory
        SessionFactory factory=new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        //create session
        Session session=factory.getCurrentSession();

        try{

            // create a student object
            System.out.println("Creating a new student object");
            Student tempStudent= new Student("Suhas","j","suhasj@spring.com");

            //start a transaction
            session.beginTransaction();
            //save student obj
            session.save(tempStudent);

            //commit transaction
            session.getTransaction().commit();
            System.out.println("commited success");
        }
        finally {
            factory.close();
        }
    }
}
