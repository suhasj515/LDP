package suhas.assignment;

public class MainClass {
    public static void main(String[] args){
        Data dataClass=new Data();
        dataClass.printVariables();
        dataClass.printInSameMethod();

        //Created object with static method and called non static variable with it.
        Singleton s=Singleton.staticMethod("a");
        s.nonStaicMethod();

    }
}
