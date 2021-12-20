package Lamdas;

public class Example {

//    interface Tradable{
//        public boolean check(Trade t);
//    }
//    public boolean isTrade(){
//
//    }

//    Tradable<Trade> te= (t1) -> t1.();

    public void methodRunnable(Runnable b){

    }
    public static void main(String[] args) {
        Runnable runnable = null;
        new Example().methodRunnable(runnable);
        new Example().methodRunnable(() -> System.out.println("OVeriding runnable"));
    }


    public String methodRunnable() {
        System.out.println(" ");
        return " ";
    }
}
