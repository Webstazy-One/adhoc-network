import java.io.*;
import java.net.*;

public class Server {
    private static final short SERVER_PORT = 8888;

    public static void main(String[] args) {
        try {
            while (true) {
                ServerSocket serverSocket = new ServerSocket(8888);

                System.out.println("Server Running on port " + SERVER_PORT);

                Socket clientSocket = serverSocket.accept();

                System.out.println("Client connected " + clientSocket.getInetAddress().getHostAddress() + "!!!");

                // Processing
                BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                String msg;
                while ((msg = reader.readLine()) != null) {
                    System.out.println("Client : " + msg);
                }

                serverSocket.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}