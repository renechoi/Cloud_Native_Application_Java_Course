package kosta.basic.java.day020.localHost;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket();
            serverSocket.bind( new InetSocketAddress("Localhost", 10010));
            System.out.println("[서버] 연결 기다림");
            Socket socket = serverSocket.accept();
            System.out.println("[서버] 연결됨");

            InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
            System.out.println("서버 연결됨 " + inetSocketAddress.getHostName() + ":" + inetSocketAddress.getPort());

            OutputStream outputStream = socket.getOutputStream();
            String data = "Hello world\n";
            outputStream.write(data.getBytes("UTF-8"));
            outputStream.flush();
            outputStream.close();




        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            if(serverSocket != null && !serverSocket.isClosed()) {
                try {
                    serverSocket.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
