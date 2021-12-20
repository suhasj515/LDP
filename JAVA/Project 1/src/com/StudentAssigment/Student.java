package com.StudentAssigment;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Student {
    public static Student[] studentList=new Student[17];
    int id,age,yoe;
    double perTillDate;
    String gender,engDept,name;
    Student(int id,String name,int age, String gender, String engDept,int yoe, double perTillDate){
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.engDept=engDept;
        this.yoe=yoe;
        this.perTillDate=perTillDate;
    }
    public static void main(String[] args){

        studentList[0]= new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8);
        studentList[1]=new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2);
        studentList[2]= new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3);
        studentList[3]=new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80);
        studentList[4]=new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70);
        studentList[5]=new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70);
        studentList[6]=new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70);
        studentList[7]=new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80);
        studentList[8]=new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85);
        studentList[9]=new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82);
        studentList[10]=new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83);
        studentList[11]=new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4);
        studentList[12]=new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6);
        studentList[13]=new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8);
        studentList[14]=new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4);
        studentList[15]=new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4);
        studentList[16]=new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5);


        List<Student> listStudent= new ArrayList<Student>();
        for(int i=0;i<17;i++)
        listStudent.add(studentList[i]);

        System.out.println("Print the name of all departments in the college?");
        System.out.println(getAllDept(listStudent));
        System.out.println();

        System.out.println("Get the names of all students who have enrolled after 2018?");
        System.out.println(getStudentName2018(listStudent));
        System.out.println();

        System.out.println("Get the details of all male student in the computer sci department?");
        System.out.println(getOnlyMale(listStudent));
        System.out.println();

        System.out.println("How many male and female student are there ?");
        getCountGender(listStudent);
        System.out.println();

        System.out.println(".What is the average age of male and female students?");
        avgAge(listStudent);
        System.out.println();

        System.out.println("Get the details of highest student having highest percentage ?");
        System.out.println("Highest percentage is :"+getHighestPercentage(listStudent));
        System.out.println();

        System.out.println("Count the number of students in each department? (Hint :use Collectors.groupingBy())?");
        getCountDept(listStudent);
        System.out.println();

        System.out.println("What is the average percentage achieved in each department?");
        getAverageEachDept(listStudent);
        System.out.println();

        System.out.println("Get the details of youngest male student in the Electronic department?");
        System.out.println(getYoungestMaleElectronics(listStudent));
        System.out.println();

        System.out.println("How many male and female students are there in the computer science department?");
        getGenderCSDept(listStudent);
        System.out.println();
    }

    public static List<String> getAllDept(List<Student> studentList){
        List<String> s= studentList.stream()
                .map(Student::getdeptName)
                .distinct()
                .collect(Collectors.toList());
        return  s;
    }

    public static List<String> getStudentName2018(List<Student> studentList){
        List<String> s=  studentList.stream()
                .filter(student -> student.yoe>=2018)
                .map(Student::getStudentName)
                .distinct()
                .collect(Collectors.toList());
        return  s;
    }

    public static List<String> getOnlyMale(List<Student> studentList){
        List<String> s=  studentList.stream()
                .filter(student -> {
                    return getStudentGender(student)=="Male";
                })
                .filter(student -> {
                    return getdeptName(student)=="Computer Science";
                })
                .map(Student::getStudentName)
                .distinct()
                .collect(Collectors.toList());
        return  s;
    }


    public static void getCountGender(List<Student> studentList){
        List<String> genders= getAllGenders(studentList);
        HashMap<String,Long> s1= (HashMap<String, Long>) genders.stream()
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()));
       System.out.println(s1);

    }
    public static void getGenderCSDept(List<Student> listStudent){

        HashMap<String,Long> s1= (HashMap<String, Long>) listStudent.stream()
                .filter(student -> getdeptName(student)=="Computer Science")
                .map(Student::getStudentGender)
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()));
        System.out.println(s1);

    }
    public static void getCountDept(List<Student> listStudent){
        HashMap<String,Long> s1= (HashMap<String, Long>) listStudent.stream()
                .map(Student::getdeptName)
                        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(s1);

    }


    public static List<String> getAllGenders(List<Student> studentList){
        List<String> s=  studentList.stream()
                .map(Student::getStudentGender)
                .collect(Collectors.toList());
        return  s;
    }

    public static void avgAge(List<Student> studentList){
        int s= studentList.stream()
                .filter(student -> getStudentGender(student) == "Male")
                .map(Student::getAge).mapToInt(Integer::intValue).sum();
        long c=studentList.stream()
                        .filter(student -> getStudentGender(student)=="Male")
                                .count();
        int s2= studentList.stream()
                .filter(student -> getStudentGender(student) == "Female")
                .map(Student::getAge).mapToInt(Integer::intValue).sum();
        long c2=studentList.stream()
                .filter(student -> getStudentGender(student)=="Female")
                .count();
        System.out.println("Average male age "+s/c);
        System.out.println("Average female age "+s2/c2);
    }


    public static Integer getHighestPercentage(List<Student> s){
        return s.stream()
            .map(Student::getStudentPercentage)
                        .max(Integer::compare).get();
    }

    public  static void getAverageEachDept(List<Student> listStudent){

        List<String> allDept= getAllDept(listStudent);
        for(String deptName:allDept)
        {
           OptionalDouble num= listStudent.stream()
                    .filter(student -> student.engDept == deptName)
                    .map(Student::getStudentPercentage)
                   .mapToInt(Integer::intValue).average();
                   System.out.println("Dept name:"+deptName+" Average:"+num.getAsDouble());
        }

    }

    public static Integer getYoungestMaleElectronics(List<Student> studentList){
        return studentList.stream()
                .filter(student -> student.engDept=="Electronic")
                .map(Student::getAge)
                .min(Integer::compare).get();
    }
    public static String getdeptName(Student s){
        return s.engDept;
    }
    public static String getStudentName(Student s){
        return s.name;
    }
    public static String getStudentGender(Student s){
        return s.gender;
    }
    public static int getStudentPercentage(Student s){
        return (int) s.perTillDate;
    }
    public static int getAge(Student s){
        return s.age;
    }
}
