package suhas.assignment;

public class Singleton {

    String nonStaticVariable;

    public static Singleton staticMethod(String nonStaticVariable){
            //this.nonStaticVariable="intialized";
                    //non-static variable this cannot be referenced from a static context
            Singleton s= new Singleton();
            return s;
    }

    public void nonStaicMethod(){
        System.out.println(nonStaticVariable);
    }

    public static void main(String[] args){
        Singleton obj=new Singleton();
        staticMethod(obj.nonStaticVariable);
        obj.nonStaicMethod();
    }
}
