package kosta.basic.day020.localHost;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TCPServer7Original {


    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress("localhost", 10001));
            System.out.println("[서버] 연결 기다림");
            Socket socket = serverSocket.accept();

            InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
            System.out.println("[서버] 연결됨 from " +
                    inetSocketAddress.getHostName() + ":" +
                    inetSocketAddress.getPort());
            // 데이터 보내기
            OutputStream outputStream = socket.getOutputStream();
//      String data = "채팅서버 접속을 환영합니다 \n";
//      os.write( data.getBytes( "UTF-8" ) );
//      os.flush();

            // 데이터 받기
            InputStream inputStream = socket.getInputStream();
            while (true) {
                byte[] buffer = new byte[128];
                int readByteCount = inputStream.read(buffer);
                System.out.println(Arrays.toString(buffer));

                if (readByteCount < 0) {
                    System.out.println("[서버] 클라이언트로 부터 연결끊김");
                    break;
                }
                String dataReceived = new String(buffer, 0, readByteCount, "UTF-8");
                System.out.println("[서버] 데이터 수신 : " + dataReceived);

                if (dataReceived.equalsIgnoreCase("exit")) {
                    System.out.println("[서버] 클라이언트로 통신 종료 요청");
                    break;
                }

                String addMessage = "!!!";
                dataReceived += addMessage;
                System.out.println(Arrays.toString(dataReceived.getBytes("UTF-8")));
                outputStream.write(dataReceived.getBytes("UTF-8"));

            }

            outputStream.close();
            inputStream.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (serverSocket != null && !serverSocket.isClosed()) {
                try {
                    serverSocket.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    private static byte[] addValue(byte[] buffer,  int readByteCount, String value) throws IOException {
        if (value.isEmpty() || value.isBlank()){
            return buffer;
        }
        List<Integer> temporalList = new ArrayList<>();
        IntStream.range(0, readByteCount + value.length())
                .filter(i -> buffer[i] != 10)
                .forEach(i -> {
                    Runnable addFunction = i < readByteCount ?
                            () -> temporalList.add((int) buffer[i]) :
                            () -> temporalList.add((int) value.getBytes()[i-readByteCount]);
                    addFunction.run();
                });

        byte[] newBuffer = new byte[temporalList.size()+1];
        IntStream.range(0, temporalList.size()).forEach(i -> newBuffer[i] = temporalList.get(i).byteValue());
        newBuffer[temporalList.size()] = 10;
        return newBuffer;
    }
}
