import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {

    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("https://www.facebook.com/");
            System.out.println("Host address = " + inetAddress.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
