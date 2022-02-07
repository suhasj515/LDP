package com.spring.hibernate.demo;


import com.spring.hibernate.demo.entity.Course;
import com.spring.hibernate.demo.entity.Instructor;
import com.spring.hibernate.demo.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class FetchJoinDemo {

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

            int theId=1;

            //create query join fetch loads all of it at ones
            Query<Instructor> query= session.createQuery("select i from Instructor i join fetch i.courseList where i.id=:theInstructorId",Instructor.class);

            //set parameters
            query.setParameter("theInstructorId",theId);

            //load instructor
            Instructor instructor=query.getSingleResult();

            System.out.println("Instructore loaded using hql : "+instructor);



            session.getTransaction().commit();
            session.close();

            //option 2 of lazy loading resolve
            System.out.println("Course handeled are : "+instructor.getCourseList());


            //commit transaction
//            session.getTransaction().commit();
            System.out.println("commited success");
        }
        finally {
            session.close();
            factory.close();
        }
    }
}
