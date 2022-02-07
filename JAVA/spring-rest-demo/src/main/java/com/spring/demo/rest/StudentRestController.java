package com.spring.demo.rest;

import com.spring.demo.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> students;

    //@PostConstruct to load data only once when given bean is contructed
    @PostConstruct
    public void loadData(){
        students= new ArrayList<>();
        students.add(new Student("Suhas","J"));
        students.add(new Student("Manoj","Kumar"));
        students.add(new Student("John","Cena"));
    }
    
    @GetMapping("/students")
    public List<Student> getStudents(){
        return students;
    }

    //retrive using path variables
    @GetMapping("/student/{studentid}")
    public Student getStudent(@PathVariable int studentid){

        //check studentid if exist
        if(studentid>= students.size() || studentid<0){
            throw new StudentNotFoundException("Student id not found :"+studentid);
        }

        //gets by index
        return students.get(studentid);
    }

}
