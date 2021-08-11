import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        try {
            System.out.println("Bat dau mo Socket");
            ServerSocket serverSocket = new ServerSocket(6666);
            Socket socket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            String string = dataInputStream.readUTF();
            System.out.println(string);
            dataInputStream.close();
            serverSocket.close();
            System.out.println("Ket thuc socket");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
