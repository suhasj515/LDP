package com.spring.hibernate.demo;


import com.spring.hibernate.demo.entity.Instructor;
import com.spring.hibernate.demo.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDemo {

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

            //get instruuctor by primary key
            int theId=1;
            Instructor instructor=session.get(Instructor.class,theId);

            System.out.println("found instructor:"+instructor);

            if(instructor!=null){
                System.out.println("Deleting object : "+instructor);
                session.delete(instructor);
            }

            
            //commit transaction
            session.getTransaction().commit();
            System.out.println("commited success");
        }
        finally {
            factory.close();
        }
    }
}
