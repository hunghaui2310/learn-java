import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("localhost");
            DatagramSocket datagramSocket = new DatagramSocket(3000, inetAddress);
            byte[] bytes = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
            datagramSocket.receive(datagramPacket);
            String string = new String(datagramPacket.getData(), 0, bytes.length);
            System.out.println(string);
            datagramSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
