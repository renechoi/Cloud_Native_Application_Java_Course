package kosta.basic.day018.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderExam {
    public static void main(String[] args) throws IOException {
        char[] arr = new char[10];
        FileReader fileReader = null;
        fileReader = new FileReader("poem.txt");
//        System.out.println(fileReader.read());
//        System.out.println(fileReader.read());          // 빈공간 = 32

        fileReader = new FileReader("poem.txt");
        Arrays.fill(arr, ' ');
        System.out.printf("배열의 길이: %s\n", fileReader.read(arr));
        System.out.print(arr[0]);
        System.out.print(arr[1]);
        System.out.print(arr[2]);
        System.out.print(arr[3]);
        System.out.print(arr[4]);
        System.out.print(arr[5]);
        System.out.print(arr[6]);
        System.out.print(arr[7]);
        System.out.print(arr[8]);
        System.out.print(arr[9]);
        System.out.print("\n");
        Arrays.fill(arr, ' ');
        fileReader.read(arr);
        if ((char) arr[0] == '\n') {
            System.out.print("<여기 개행문자:\\n>");
        }
//            System.out.print(arr[0]);
        System.out.print(arr[1]);
        System.out.print(arr[2]);
        System.out.print(arr[3]);
        System.out.print(arr[4]);
        System.out.print(arr[5]);
        System.out.print(arr[6]);
        System.out.print(arr[7]);
        System.out.print(arr[8]);
        System.out.print(arr[9]);
        System.out.print("\n");
        Arrays.fill(arr, ' ');
        fileReader.read(arr);
        if ((char) arr[0] == '\n') {
            System.out.print("<여기 개행문자:\\n>");
        }
        System.out.print(arr[1]);
        System.out.print(arr[2]);
        System.out.print(arr[3]);
        System.out.print(arr[4]);
        System.out.print(arr[5]);
        System.out.print(arr[6]);
        System.out.print(arr[7]);
        System.out.printf("<지금 문자는:'%s'>", arr[8]);

        System.out.println();
        Arrays.fill(arr, ' ');
        fileReader.read(arr);
        System.out.print(fileReader.read(arr));

//
//            while (true) {
//                Arrays.fill(arr, ' ');
//
//               int data = fileReader.read(arr);
//               if (data==-1) {
//                   break;
//               }
//                System.out.println(arr);
//            }


    }

    private static void readFileBasics() throws IOException {
        // 파일에 있는 문자 데이터를 읽어보자

        FileReader fileReader = null;

        fileReader = new FileReader("poem.txt");

        while (true) {
            int alphabetAscii = fileReader.read();
            if (alphabetAscii == -1) {
                break;
            }
            System.out.println((char) alphabetAscii);
        }

    }
}
