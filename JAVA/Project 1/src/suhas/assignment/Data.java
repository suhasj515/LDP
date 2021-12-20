package suhas.assignment;


public class Data {

        int member1;
        char member2;
        void printVariables(){
            System.out.println("Member 1 "+member1+" Member2 "+member2);
        }
        void printInSameMethod(){
            int functionMember1;
            char functionMember2;
            //System.out.println("function member 1"+functionMember1+" function member 2"+functionMember2);
                //Local variables does not have default value
        }

        public static void main(String[] args){
            Data d= new Data();
            d.printInSameMethod();
            d.printVariables();
        }
}
