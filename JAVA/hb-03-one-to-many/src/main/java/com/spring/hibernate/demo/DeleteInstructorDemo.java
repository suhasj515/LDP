package com.spring.hibernate.demo;


import com.spring.hibernate.demo.entity.Course;
import com.spring.hibernate.demo.entity.Instructor;
import com.spring.hibernate.demo.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class DeleteInstructorDemo {

    public static void main(String[] args){

        //create session factory
        SessionFactory factory=new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();
        //create session
        Session session=factory.getCurrentSession();

        try{



            //start a transaction
            session.beginTransaction();

            //get course
            int theId=10;
            Course tempCourse=session.get(Course.class,theId);

            //delete course
            session.delete(tempCourse);




            //commit transaction
            session.getTransaction().commit();
            System.out.println("commited success");
        }
        finally {
            session.close();
            factory.close();
        }
    }
}
