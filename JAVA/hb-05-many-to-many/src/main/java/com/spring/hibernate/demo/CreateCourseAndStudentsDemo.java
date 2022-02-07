package com.spring.hibernate.demo;


import com.spring.hibernate.demo.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCourseAndStudentsDemo {

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

            //create a course
            Course tempCourse=new Course("Maths");


            System.out.println("SAving the course");
            session.save(tempCourse);

            //create students
            Student student1=new Student("Jon","cena","no@gmail.com");
            Student student2=new Student("Mary","Jane","jane220@gmail.com");



            //add students
            tempCourse.addStudent(student1);
            tempCourse.addStudent(student2);





            //save students
            System.out.println("Saving students");
            session.save(student1);
            session.save(student2);
            System.out.println("Saved students list "+ tempCourse.getStudentList());



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
