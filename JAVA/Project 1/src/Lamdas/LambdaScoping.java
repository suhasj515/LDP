package Lamdas;


//Method references
interface interface1{
    String method1in(Example a);
}
public class LambdaScoping extends SuperScoping {

    String member="class memeber";

    interface memberType{
        String who(String member);
    }
    public void testMember(String member) {
        memberType m = (String fmember) -> { //used fmemeber as memeber cannot be used as it is declared in parameter
            System.out.println(member);
            System.out.println(this.member);
            System.out.println(super.memeber);
            return member;
        };

        m.who(member);
    }
    interface in{
        String newin(String n);
    }
    in n= (String s) -> "as";
    public static void main(String[] args){
        LambdaScoping ls=new LambdaScoping();
        ls.testMember("function member");
    }

    //Method references
    public static void methodReference() {
        interface1 in = (e) -> e.methodRunnable();
        interface1 on = Example::methodRunnable;
    }

}
