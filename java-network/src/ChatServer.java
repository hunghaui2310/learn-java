import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(3333);
            Socket socket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            Scanner scanner = new Scanner(System.in);
            while (true) {
                // doc du lieu tu client truyen len
                String s = dataInputStream.readUTF();
                if (s.equals("q")) {
                    break;
                }
                System.out.println("Client said: " + s);

                // truyen du lieu tu Server ve
                String dataFromServer = scanner.nextLine();
                dataOutputStream.writeUTF(dataFromServer);
                dataOutputStream.flush();
            }

            dataOutputStream.close();
            dataInputStream.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
