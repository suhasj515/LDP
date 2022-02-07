package com.spring.hibernate.demo;


import com.spring.hibernate.demo.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddCoursesToMarryAndStudentsDemo {

    public static void main(String[] args){

        //create session factory
        SessionFactory factory=new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Review.class)
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        //create session
        Session session=factory.getCurrentSession();

        try{

            //start a transaction
            session.beginTransaction();

            int theId=2;

            Student mary= session.get(Student.class,theId);
            //create a course
            Course tempCourse1=new Course("Science");
            Course tempCourse2=new Course("Game Development");


            //adding course to mary
            tempCourse1.addStudent(mary);
            tempCourse2.addStudent(mary);

            System.out.println("SAving the courses");
            session.save(tempCourse1);
            session.save(tempCourse2);


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
