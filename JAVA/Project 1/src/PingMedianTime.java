import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.GregorianCalendar;

public class PingMedianTime {
    public static void getPingTime(String host) throws IOException {
        InetAddress inet= InetAddress.getByName(host);
        long finish=0;
        long start=new GregorianCalendar().getTimeInMillis();
        if(inet.isReachable(5000)){
            finish=new GregorianCalendar().getTimeInMillis();
            System.out.println("host is reacheable in "+(finish-start)+"ms");
        }else {
            System.out.println("host is unreachable");
        }
    }

    public static void main(String[] args) throws IOException {
        getPingTime("192.168.0.1");
    }
}
