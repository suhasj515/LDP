class OuterClass {
    OuterClass(){
        System.out.println("outer class constructor");
    }
    class InnerClass{
        InnerClass(String s){
            System.out.println("Inner class constructor with argument:"+s);
        }


    }
}

class OuterClass2 {
    OuterClass2() {
        System.out.println("outer class 2 constructor");
    }

    public class InnerClass2 extends OuterClass {
        InnerClass2(String s){
            super();
            System.out.println("This is secound inner class"+s);
        }
    }
}

class InnerOuterClass{
    public static void main(String[] args){
        OuterClass2.InnerClass2 innerOuterClasses= new OuterClass2().new InnerClass2("string");
    }
}
