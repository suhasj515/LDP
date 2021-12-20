package com.interface_assigment;

interface One{
    void method1();
    void method2();
}
interface Two{
    void method3();
    void method4();
}
interface Three{
    void method5();
    void method6();
}

interface Combine extends One, Two, Three {
    void method7();
}

class classOne {


    public void custommethod1() {
        System.out.println("classone method 1");
    }

    public void custommethod2() {
        System.out.println("classone method 1");
    }
}

public class MultipleInterface  extends classOne implements Combine {


    public void classmethod1(One e){

        System.out.println("First interface");
    }
    public void classmethod2(Two e){
        System.out.println("Secound interface");
    }
    public void classmethod3(Three e){
        System.out.println("Third interface");
    }
    public void classmethod4(Combine e){
        System.out.println("Combined interface");
    }
    //Create three interfaces, each with two methods. Inherit a new interface that combines the three,
    // adding a new method. Create a class by implementing the new interface and also inheriting from a concrete class.
    // Now write four methods, each of which takes one of the four interfaces as an argument.
    // In main( ), create an object of your class and pass it to each of the methods.
    public static void main(String [] args) {
        MultipleInterface mi = new MultipleInterface();

        One one=new MultipleInterface();
        mi.classmethod1(one);
        Two two=null;
        mi.classmethod2(two);
        Three three=null;
        mi.classmethod3(three);
        Combine combine=null;
        mi.classmethod4(combine);
        mi.classmethod1(one);

    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    @Override
    public void method4() {

    }

    @Override
    public void method5() {

    }

    @Override
    public void method6() {

    }

    @Override
    public void method7() {

    }
}

//class temp{
//    public static void main(String[] args){
//        Combine combine=new MultipleInterface();
//
//    }
//}