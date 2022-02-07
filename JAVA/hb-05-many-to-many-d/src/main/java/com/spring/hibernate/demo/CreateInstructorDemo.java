package com.spring.hibernate.demo;


import com.spring.hibernate.demo.entity.Course;
import com.spring.hibernate.demo.entity.Instructor;
import com.spring.hibernate.demo.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateInstructorDemo {

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

            // create the objects
//            Instructor tempInstructor=new Instructor("manoj","darby","manoj@spring.com");
//
//            InstructorDetail instructorDetail=new InstructorDetail("youtube.com/manoj","cricket");

            Instructor tempInstructor=new Instructor("manoj","kumar","manoj@spring.com");

            InstructorDetail instructorDetail=new InstructorDetail("youtube.com/manoj","youtube");

            //associate objects
           tempInstructor.setInstructorDetail(instructorDetail);

            //start a transaction
            session.beginTransaction();

            //this will also save instructor detail object because of cascade.ALL
            System.out.println("Saving instructor"+tempInstructor);
            session.save(tempInstructor);


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
