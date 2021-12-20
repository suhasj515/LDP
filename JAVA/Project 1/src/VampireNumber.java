import suhas.assignment.Singleton;

import java.util.Arrays;

public class VampireNumber {
    public static void main(String[] args){
        int count=0;
        int number=9;
        while(count<101) {
            number=number+1;
            boolean b = checkVampire(number);
            if(b){
                System.out.println(number);
                count++;
            }
        }
    }
    public static boolean checkVampire(int n){

        int i,j;
        int noOfDigits=0;
        for(i=n;i>0;i/=10){
            noOfDigits++;
        }
        if(noOfDigits%2!=0){
            return false;
        }else {
            for(i=(int)Math.pow(10,noOfDigits/2-1);i<(int)Math.pow(10,noOfDigits/2);i++){
                if(n%i==0)
                {
                    j=n/i;
                    String ans= String.valueOf(i)+String.valueOf(j);
                    char[] ansChar=ans.toCharArray();
                    Arrays.sort(ansChar);
                    char[] cn= ("" + n).toCharArray();
                    Arrays.sort(cn);
                    if(String.valueOf(cn).equalsIgnoreCase(String.valueOf(ansChar))){
                        return true;

                    }
                }
            }
        }
        return false;
    }
}
