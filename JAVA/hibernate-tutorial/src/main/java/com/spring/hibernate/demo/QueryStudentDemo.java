package com.spring.hibernate.demo;

import com.spring.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryStudentDemo {

    public static void main(String[] args){

        //create session factory
        SessionFactory factory=new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        //create session
        Session session=factory.getCurrentSession();

        try{

            //start a transaction
            session.beginTransaction();

            //query students
            List<Student> theStudents=session.createQuery("from Student").list();
            displayStudents(theStudents);

            //query lastname=kumar
            theStudents=session.createQuery("from Student s where s.lastName='kumar'").list();
            System.out.println("\nLast Name Query :");
            displayStudents(theStudents);

            //query lastname='doe' or first name='manoj'
            theStudents=session.createQuery("from Student s where s.lastName='doe' OR s.firstName='Manoj'").list();
            System.out.println("\nfirstName or last name query: ");
            displayStudents(theStudents);

            //query to find email ends with spring.com
            theStudents=session.createQuery("from Student s where s.email like '%@spring.com'").list();
            System.out.println("\n Email ends with spring.com");
            displayStudents(theStudents);

            //commit transaction
            session.getTransaction().commit();
            System.out.println("commited success");
        }
        finally {
            factory.close();
        }
    }

    private static void displayStudents(List<Student> theStudents) {
        for(Student temp: theStudents){
            System.out.println(temp);
        }
    }
}
