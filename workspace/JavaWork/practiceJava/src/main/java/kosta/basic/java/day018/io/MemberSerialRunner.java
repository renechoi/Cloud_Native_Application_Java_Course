package kosta.basic.java.day018.io;

import java.io.*;

public class MemberSerialRunner {

    private static Member member;

    // 객체 직렬화
    public static void write() throws IOException {
        member = new Member("홍길동", 39);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("objectTest1.ser"));
        objectOutputStream.writeObject(member);
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
