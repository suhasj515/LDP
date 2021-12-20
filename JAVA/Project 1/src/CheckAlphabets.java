import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CheckAlphabets {

    public void checkAlphabets(String wordInsensitive) throws UnsupportedEncodingException {
        String word=wordInsensitive.toLowerCase();
        char[] charArray= word.toCharArray();
        byte[] bytes = word.getBytes("US-ASCII");
        List<Integer> tracker=new ArrayList<Integer>();
        for(int a:bytes){
            if(a>=97 && a<=122 ){
                if(!(tracker.contains(a))){
                    tracker.add(a);
                }
            }
        }
        System.out.println(tracker.size());
        if(tracker.size()==26){
            System.out.println("Contains all alphabets");
        }else {
            System.out.println("Only contains "+tracker.size()+" charecters");
        }
    }
    public static void main(String[] args) throws UnsupportedEncodingException {
        CheckAlphabets Obj=new CheckAlphabets();
        Scanner sc=new Scanner(System.in);
        String word= sc.nextLine();
        Obj.checkAlphabets(word);
    }

}

// Time Complexity O(n)
// SPace complexity O(n)
