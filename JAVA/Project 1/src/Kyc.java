import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Kyc {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int noOfItems=sc.nextInt();
        sc.nextLine();
        Kyc k=new Kyc();
        String[] inputDate=new String[noOfItems];
        for(int i=0;i<inputDate.length;i++) {
            inputDate[i]= sc.nextLine();
        }
        for(int i=0;i<inputDate.length;i++) {
            k.calcDateRange(inputDate[i]);
        }

    }

    public void calcDateRange(String dates) {
        LocalDate[] d1 = new LocalDate[2];
        String ans = "";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        int c = 0;
        String[] datesArr = dates.split(" ");
        for (String s : datesArr) {
            String[] ele = s.split("-");
            int date = Integer.parseInt(ele[0]);
            int month = Integer.parseInt(ele[1]);
            int year = Integer.parseInt(ele[2]);
            d1[c] = LocalDate.of(year, month, date);
            c = c + 1;

        }
        LocalDate aniversery = LocalDate.of(d1[1].getYear(), d1[0].getMonth(), d1[0].getDayOfMonth());
        if (d1[0].isAfter(d1[1])) {
            ans = "No Range";
        } else {
            if (d1[1].isAfter(aniversery)) {
                if (d1[1].isAfter(aniversery.plusDays(30))) {
                    ans = aniversery.minusDays(30).format(formatter).toString() + " " + aniversery.plusDays(30).format(formatter).toString();
                } else {
                    ans = aniversery.minusDays(30).format(formatter).toString() + " " + d1[1].format(formatter).toString();
                }
            } else {
                if (d1[1].isAfter(aniversery.minusDays(30))) {
                    ans = aniversery.minusDays(30).format(formatter).toString() + " " + d1[1].format(formatter).toString();
                } else {
                    ans = aniversery.minusDays(30).format(formatter).toString() + " " + aniversery.plusDays(30).format(formatter).toString();
                }
            }

        }
        System.out.println(ans);
    }
}
