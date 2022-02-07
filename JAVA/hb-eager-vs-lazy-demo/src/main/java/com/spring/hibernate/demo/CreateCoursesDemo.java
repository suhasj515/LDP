package com.spring.hibernate.demo;


import com.spring.hibernate.demo.entity.Course;
import com.spring.hibernate.demo.entity.Instructor;
import com.spring.hibernate.demo.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCoursesDemo {

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


            //get the instructor from db
            int theId=1;
            Instructor tempInstructor= session.get(Instructor.class,theId);

            // create course
            Course mathCourse=new Course("Maths");
            Course scienceCourse= new Course("Science");

            //add the courses to instructor
            tempInstructor.add(mathCourse);
            tempInstructor.add(scienceCourse);

            //save the courses
            session.save(mathCourse);
            session.save(scienceCourse);



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
