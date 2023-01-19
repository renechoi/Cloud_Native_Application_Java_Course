package kosta.basic.java.day020.localHost;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

    private static final String ServerIP = "localhost";
    private static final int PORT = 10001;

    public static void main(String[] args) {
        Socket socket = null;
        Scanner sc = new Scanner(System.in);

        try {
            socket = new Socket();
            socket.connect(new InetSocketAddress(ServerIP, PORT));

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());

            while (true) {
                System.out.print("<-");
                String request = sc.nextLine();

                if (request == null) {
                    System.out.println("접속 종료");
                    break;
                } else {
                    printWriter.print(request + "\n");
                    printWriter.flush();
                    System.out.println("->" + bufferedReader.readLine());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null && !socket.isClosed()) {
                try {
                    socket.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
