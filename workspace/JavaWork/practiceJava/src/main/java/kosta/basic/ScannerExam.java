package kosta.basic;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt(); // 2 + enter
        String numberString = scanner.nextLine();
        String numberString2 = scanner.nextLine();

        System.out.println(number);
        System.out.println(numberString);


        int number2 =10;
        number2 = number2 +1 ;
        number2 +=1;

        int x = 10;
        int y = 0;

        y = ++x; //x++;

        System.out.println("num =" + ++number2);
        System.out.println("num =" + number2++);
    }
}
