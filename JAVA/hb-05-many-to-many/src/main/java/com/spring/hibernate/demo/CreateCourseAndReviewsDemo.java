package com.spring.hibernate.demo;


import com.spring.hibernate.demo.entity.Course;
import com.spring.hibernate.demo.entity.Instructor;
import com.spring.hibernate.demo.entity.InstructorDetail;
import com.spring.hibernate.demo.entity.Review;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCourseAndReviewsDemo {

    public static void main(String[] args){

        //create session factory
        SessionFactory factory=new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Review.class)
                .buildSessionFactory();
        //create session
        Session session=factory.getCurrentSession();

        try{

            //start a transaction
            session.beginTransaction();

            //create a course
            Course tempCourse=new Course("Maths");

            //add some reviews
            tempCourse.addReview(new Review("good course"));
            tempCourse.addReview(new Review("complicated course"));
            tempCourse.addReview(new Review("easy course"));

            //save the course and leverage cascade all
            System.out.println("saving course :"+ tempCourse);
            System.out.println("Reviews :"+ tempCourse.getReviewList());
            session.save(tempCourse);




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
