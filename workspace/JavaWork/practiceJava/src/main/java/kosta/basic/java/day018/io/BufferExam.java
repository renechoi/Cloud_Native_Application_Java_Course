package kosta.basic.java.day018.io;

import java.io.*;
import java.util.Optional;

public class BufferExam {
    public static void main(String[] args) throws IOException {
        // 스캐너를 사용하지 않고 스트림을 이용해서 입력을 받아 보자 !

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("outputExample.txt"));



    }

    private static void readAndWriteExample(BufferedReader bufferedReader, BufferedWriter bufferedWriter) throws IOException {
        // 1번째
        String text = "";
        while ((text = bufferedReader.readLine()) != null) {
            text += "\n";
            bufferedWriter.write(text);
            bufferedWriter.flush();
        }

        // 2번째
        String text2 = bufferedReader.readLine();
        while (text2 != null) {
            text2 += "\n";
            bufferedWriter.write(text2);
            text2 = bufferedReader.readLine();
            bufferedWriter.flush();
        }

        // 3번째
        StringBuilder text3 = new StringBuilder(bufferedReader.readLine());
        while (text3 != null) {
            text3.append("\n");
            bufferedWriter.write(text3.toString());
            text3 = new StringBuilder(bufferedReader.readLine());
            bufferedWriter.flush();
        }

        // 4번째
        StringBuilder text4 = Optional.ofNullable(bufferedReader.readLine()).map(StringBuilder::new).orElse(null);
        while (text4 != null) {
            text4.append("\n");
            bufferedWriter.write(text4.toString());
            text4 = Optional.ofNullable(bufferedReader.readLine()).map(StringBuilder::new).orElse(null);
            bufferedWriter.flush();
        }
    }

    private static void originalWay() {
        InputStream in = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    }
}
