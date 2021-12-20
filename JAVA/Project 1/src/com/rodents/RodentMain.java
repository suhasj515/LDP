package com.rodents;
 class Rodents {
    Rodents(){
        System.out.println("This is rodents class");
    }

    public void run(){
        System.out.println("Rodenet running");
    }
    public void eat(){
        System.out.println("Rodenet eating");
    }
}
 class Mouse extends Rodents{
    Mouse(){
        System.out.println("This is mouse class");
    }
     public void run(){
         System.out.println("Mouse running");
     }
     public void eat(){
         System.out.println("Mouse eating");
     }
}

class Gerbel extends Rodents{
    Gerbel(){
        System.out.println("This is gerbel class");
    }
    public void run(){
        System.out.println("Gerbel running");
    }
    public void eat(){
        System.out.println("Gerbel eating");
    }
}

class Hamster extends Rodents{
    Hamster(){
        System.out.println("This is hamster class");
    }
    public void run(){
        System.out.println("Hamster running");
    }
    public void eat(){
        System.out.println("Hamster eating");
    }
}

public class RodentMain {
     public static void main(String[] args){
         Rodents[] rodents=new Rodents[4];

         rodents[0]=new Rodents();
         rodents[1]=new Gerbel();
         rodents[2]=new Mouse();
         rodents[3]=new Hamster();

         rodents[0].eat();
         rodents[1].eat();
         rodents[2].eat();
         rodents[3].eat();

         rodents[0].run();
         rodents[1].run();
         rodents[2].run();
         rodents[3].run();
     }
}

