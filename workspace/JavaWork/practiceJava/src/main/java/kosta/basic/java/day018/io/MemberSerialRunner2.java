package kosta.basic.java.day018.io;

import java.io.*;

public class MemberSerialRunner2 {

    private static Member member;
    private static Video video;

    // 객체 직렬화
    public static void write() throws IOException {
        member = new Member("홍길동", 39);
        video = new Video("1");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("objectTest1.ser"));
        objectOutputStream.writeObject(member);
        objectOutputStream.writeObject(video);
    }

    // 객체 역직렬화
    public static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("objectTest1.ser"));
        Member member1 = (Member) objectInputStream.readObject();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        write();
        member = null;
        read();
    }
}
