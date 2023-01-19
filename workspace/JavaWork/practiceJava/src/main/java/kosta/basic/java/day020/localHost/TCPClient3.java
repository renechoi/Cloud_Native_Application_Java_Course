package kosta.basic.java.day020.localHost;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class TCPClient3 {

    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = new Socket();
            System.out.println("[클라이언트] 연결 요청");
            socket.connect(new InetSocketAddress("127.0.0.1", 10001));
            System.out.println("[클라이언트] 연결 성공");

            // 데이터 쓰고 받기
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            String data = "[Client] hello world\n";
            os.write( data.getBytes( "UTF-8" ) );

            byte[] buffer = new byte[128];
            int readByteCount = is.read( buffer );

            data = new String( buffer, 0, readByteCount, "UTF-8" );
            System.out.println( "[클라이언트] 데이터 수신 :" + data );

            is.close();
            os.close();

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
