import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileOperationsAndMap {

    public static void main(String[] args) throws IOException {
        String[] counts=FileThing();
        String ans=countInAFile(counts);
        writeInFile(ans);

    }
    public static String countInAFile(String[] sarray) {
        Map<Character, Integer> mpobj = new HashMap<Character, Integer>();
        ArrayList<Character> al = new ArrayList<Character>();
        for(String s:sarray) {
            char[] c = s.toCharArray();
            for (char c1 : c) {
                if (!(al.contains(c1))) {
                    mpobj.put(c1, 1);
                    al.add(c1);
                } else {
                    mpobj.put(c1, mpobj.get(c1) + 1);

                }
            }
        }
        return mpobj.toString();
    }
    public static String[] FileThing() throws FileNotFoundException {

        File f=new File("/home/suhasj/LDP/JAVA/Project 1/src/sample.txt");
        Scanner sc= new Scanner(f);
        int count=0;
        while(sc.hasNextLine()){
            count+=1;
            sc.nextLine();
        }
        String[] words=new String[count];
        Scanner sc1= new Scanner(f);
        int i=0;
        while (sc1.hasNextLine()){
            words[i]=sc1.nextLine();
            i++;
        }
        return words;



    }

    static void writeInFile(String data) throws IOException {
        FileWriter f=new FileWriter("/home/suhasj/LDP/JAVA/Project 1/src/result.txt");
        f.write(data);
        System.out.println("Result in avalible in /home/suhasj/LDP/JAVA/Project 1/src/result.txt");
        f.close();
    }


    }
