package com.interface_assigment;

interface Cycle{
    public void logicCode();
    public void factory();
}
class Unicycle implements Cycle{
    public void logicCode(){
        System.out.println("logic code is written here");
        factory();

    }
    public void factory(){
        System.out.println("This is a factory for unicycle");
    }
}

class Bicycle implements Cycle{
    public void logicCode(){
        System.out.println("logic code is written here");
        factory();
    }

    public void factory() {
        System.out.println("This is factory for Bicycle");
    }
}
class Tricycle implements Cycle{
    public void logicCode(){
        System.out.println("logic code is written here");
        factory();
    }

    public void factory() {
        System.out.println("This is factory for Tricycle");
    }
}

public class CycleFactories {
    public static void main(String[] args){
        Unicycle unicycle=new Unicycle();
        unicycle.logicCode();
        Bicycle bicycle=new Bicycle();
        bicycle.logicCode();
        Tricycle tricycle=new Tricycle();
        tricycle.logicCode();
    }

}
