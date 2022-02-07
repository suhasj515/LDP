package com.spring.hibernate.demo;

import com.spring.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudentDemo {

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
            Student tempStudent= new Student("prajwal","ldp","praj@spring.com");

            //start a transaction
            session.beginTransaction();
            //save student obj
            System.out.println(tempStudent);
            session.save(tempStudent);

            //commit transaction
            session.getTransaction().commit();
            System.out.println("commited success");

            System.out.println("Saved student id"+tempStudent.getId());

            //get a new session
            session=factory.getCurrentSession();
            session.beginTransaction();
            //retrive student based on id
            System.out.println("Getting student");
            Student myStudent=session.get(Student.class,tempStudent.getId());
            System.out.println("Getting complete :"+myStudent);

            //commit transaction
            session.getTransaction().commit();



        }
        finally {
            factory.close();
        }
    }
}
