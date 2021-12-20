package Lamdas;

public class CreateLambdas {

    interface Greeting{
        public String greet(String s);
    }
    public void greetMethod(String name,Greeting message){
        String ans=message.greet(name);
        System.out.println(ans);
    }
    public static void main(String[] args){
        new CreateLambdas().greetMethod("Steve",(name) -> !name.isEmpty()? "Hi there "+name :"Please enter name" );
        new CreateLambdas().greetMethod("",(name) -> !name.isEmpty()? "Hi there "+name :"Please enter name" );
    }
}
