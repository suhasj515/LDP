package com.spring.hibernate.demo;

import com.spring.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateStudentDemo {

    public static void main(String[] args){

        //create session factory
        SessionFactory factory=new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        //create session
        Session session=factory.getCurrentSession();

        try{
            //start a transaction
            session.beginTransaction();

            //retrive student based on id
            int studentId=1;
            System.out.println("Getting student with id :"+studentId);
            Student myStudent=session.get(Student.class,studentId);

            //updating student obj
            System.out.println("updating obj");
            myStudent.setFirstName("john");

            //don't need to save mystudent as it is system obj retrieved from bd

            //commit transaction
            session.getTransaction().commit();

            //NEW update
            session= factory.getCurrentSession();
            session.beginTransaction();

            //update email of all students to foo.gmail.com
            session.createQuery("update Student set email='foo@gmail.com'").executeUpdate();

            //commit transaction
            session.getTransaction().commit();
            System.out.println("Done");




        }
        finally {
            factory.close();
        }
    }
}
