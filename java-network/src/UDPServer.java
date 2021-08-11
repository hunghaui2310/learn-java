import java.io.IOException;
import java.net.*;

public class UDPServer {

    public static void main(String[] args) {
        try {
            DatagramSocket datagramSocket = new DatagramSocket();
            InetAddress ip = InetAddress.getByName("localhost");
            String string = "Test UDP Protocol";
            DatagramPacket datagramPacket = new DatagramPacket(string.getBytes(), string.length(), ip, 3000);
            datagramSocket.send(datagramPacket);
            datagramSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
