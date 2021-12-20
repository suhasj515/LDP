import java.io.File;
import java.util.Scanner;

public class FindFiles {

    public static void main(String [] args){

        FindFiles Obj=new FindFiles();
        Obj.FindingFiles();

    }

    public void FindingFiles()
        {
            while(true) {
                Scanner sc = new Scanner(System.in);
                int FLag=0;
                System.out.println("Enter file to be found");
                String fileToBeFoundRegex = sc.nextLine(); //".*\\.txt"
                File file = new File("/home/suhasj");
                String[] FileNames = file.list();
                for (String s1 : FileNames) {
                    if (s1.matches(fileToBeFoundRegex)) {
                        System.out.println(file.getAbsolutePath() + "/" + s1);
                        FLag=1;
                    }
                }
                if(FLag==0)
                {
                    System.out.println("FIle not found");
                }

            }
        }
}

