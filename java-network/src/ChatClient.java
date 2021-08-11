import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {

    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost", 3333);
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            Scanner scanner = new Scanner(System.in);
            while (true) {
                // truyen du lieu len Server
                String str = scanner.nextLine();
                dataOutputStream.writeUTF(str);
                if (str.equals("q")) {
                    break;
                }

                // doc du lieu tu Server
                String str2 = dataInputStream.readUTF();
                System.out.println("Server said: " + str2);
            }

            dataInputStream.close();
            dataOutputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
