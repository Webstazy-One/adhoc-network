import java.net.*;
import java.io.*;

public class Client {
    private static final String HOST = "127.0.0.1";

    public static void main(String[] args) {
        try {
            Socket socket = new Socket(HOST, 8888);

            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            System.out.println("Connected to server!");

            writer.println("hi");

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}