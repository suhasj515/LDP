import suhas.assignment.Singleton;

import java.util.Scanner;
import java.util.regex.Pattern;
public class RegexPattern {

    public static boolean isMatching(String sentence){

        return Pattern.matches("^[A-Z].*[.]$",sentence);

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sentence");
        String sentence=sc.nextLine();
        if(isMatching(sentence)){
            System.out.println("Is a sentence");
        }else {
            System.out.println("Not a sentence");
        }
    }


}
