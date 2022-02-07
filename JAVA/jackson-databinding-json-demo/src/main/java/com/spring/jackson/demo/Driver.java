package com.spring.jackson.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {
    public static void main(String [] args){

        try {
            //create object mapper
            ObjectMapper mapper= new ObjectMapper();


            //read json file and convert java pojo
            Student student= mapper.readValue(new File("data/sample-full.json"),Student.class);

            System.out.println("First name: "+student.getFirstName());
            System.out.println("Last name: "+student.getLastName());
            System.out.println("City: "+student.getAddress().getCity());
        }
        catch (Exception exe){
            exe.printStackTrace();

        }
    }
}






















