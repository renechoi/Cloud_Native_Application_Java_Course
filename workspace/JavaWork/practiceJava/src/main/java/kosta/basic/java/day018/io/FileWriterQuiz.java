package kosta.basic.java.day018.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterQuiz {
    public static void main(String[] args) throws IOException {
        // 키보드로부터 문자열을 입력 받아 파일쓰기를 구현하자
        // q를 입력하면 종료 => q를 입력하기 전까지의 문자열을 파일쓰기를 하자
        // 입력 => 안녕
        // 입력 => 반갑다
        // 입력 => q => 종료

        // FileWriter / write
        // 파일명 -> poem2.txt -> 반드시 close를 해야 파일이 생성됨


        String text = """
        안녕
        나는 텍스트 블록으로 만들어진 텍스트라고 해!
        자바 15부터 탄생했지.하하하.
        """;

        FileWriter fileWriter = new FileWriter("poem2.txt");
        fileWriter.write(text);
        fileWriter.close();



    }
}
