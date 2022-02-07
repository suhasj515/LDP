package com.spring.hibernate.demo;


import com.spring.hibernate.demo.entity.Instructor;
import com.spring.hibernate.demo.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteInstructorDetailDemo {

    public static void main(String[] args){

        //create session factory
        SessionFactory factory=new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();
        //create session
        Session session=factory.getCurrentSession();

        try{


            //start a transaction
            session.beginTransaction();

            //get instructor detail object
            int theId=2;

            InstructorDetail instructorDetail= session.get(InstructorDetail.class,theId);


            //print instructor detail
            System.out.println("The instructor detail of id :"+instructorDetail);

            //get assoiated detail
            System.out.println("The associated instructor :"+instructorDetail.getInstructor());

            //break the bi-directional link
            instructorDetail.getInstructor().setInstructorDetail(null);

            //delete instructor detail
            session.delete(instructorDetail);


            //commit transaction
            session.getTransaction().commit();
            System.out.println("commited success");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            session.close();
            factory.close();
        }
    }
}
