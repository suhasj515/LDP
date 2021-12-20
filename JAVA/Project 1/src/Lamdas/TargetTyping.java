package Lamdas;

public class TargetTyping {

    interface Email{
        public String getEmail(String name);

    }
    //Checks for method signature and return type at the end exceptions
    Email email=(String name) -> name+"@google.com";

    public static void register(String form,Email email){
        System.out.println("email has been registered with form"+email);
    }

    public static void main(String[] args){
        register("Notification form",(String name) -> name+"@gmail.com"  );
    }
}
