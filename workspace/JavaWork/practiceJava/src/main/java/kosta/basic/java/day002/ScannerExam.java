package kosta.basic.java.day002;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {}




    private static void incrementAndDecrementOperator() {
        int number2 =10;
        number2 = number2 +1 ;
        number2 +=1;

        int x = 10;
        int y = 0;

        y = ++x; //x++;

        System.out.println("num =" + ++number2); // 11
        System.out.println("num =" + number2++); // 13
    }

    private static void practiceScanner() {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt(); // 2 + enter
        String numberString = scanner.nextLine();
        String numberString2 = scanner.nextLine();

        System.out.println(number);
        System.out.println(numberString);
    }

    private static void practiceBooleanOperator(){
        int a = 10;
        int b = 9;
        int c = 20;

        // TODO : 연산자를 사용해보자

        if (a>b){
            System.out.println("a>b");
        }

        if (a!=b){
            System.out.println("a!=b");
        }

        if (a<b && b>c){
            System.out.println("a<b && b>c");
        }
    }

    private static void ternaryOperator(){
        int a  = 10;
        int b = 20;
        int c = 30;

        int test = 0;
        test = a < b ? a- b : b -c;
    }


}
