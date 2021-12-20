public class TwoConstructors {
    private int number;

    TwoConstructors(){
        TwoConstructors d=new TwoConstructors(12);
        
    }
    TwoConstructors(int number){
        this.number=number;
        System.out.println(this.number);
    }

    public static void main(String[] args){
        TwoConstructors tc=new TwoConstructors();
    }
}
