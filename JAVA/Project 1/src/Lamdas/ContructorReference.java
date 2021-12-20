package Lamdas;

public class ContructorReference {
    class Movie{
        Movie(String name){

        }
        Movie(String name,String rating){}
    }
    interface movieInterface{
        Movie set(String name);
    }

    movieInterface m= (i) -> new Movie(i); //Using new keyword for contructor
    movieInterface m2= Movie::new;


    //Type interface

    interface typeinterface{
        String run(Example e,CreateLambdas c);
    }

    typeinterface t=(e,c) -> "return"; //logic  dont hace to mention type



    public static void main(String [] args){
        ContructorReference c=new ContructorReference();
    }
}
