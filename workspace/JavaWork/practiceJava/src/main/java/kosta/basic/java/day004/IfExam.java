package kosta.basic.java.day004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;

public class IfExam {
    public static void main(String[] args) throws IOException {
    }

    private static void simpleCalculation() throws IOException {
        // TODO : 두 정수와 연산 기호를 입력 받아 결과를 출력해보자

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int operand1 = Integer.parseInt(bufferedReader.readLine());
        int operand2 = Integer.parseInt(bufferedReader.readLine());
        String operator = bufferedReader.readLine();

        if (operator.equals("+")) {
            System.out.println(operand1 + operand2);
            return;
        }
        if (operator.equals("-")) {
            System.out.println(operand1 - operand2);
            return;
        }
        if (operator.equals("/")){
            System.out.println(operand1/operand2);
            return;
        }
        if (operator.equals("*")){
            System.out.println(operand1*operand2);
            return;
        }


    }

    private static void compareTwoStrings() {
        // TODO : 문자열을 입력 받아 서로 비교 -> 같다/다르다 출력

        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        if (word1.equals(word2)) {
            System.out.println("these words are equal");
        }

        if (word1.equalsIgnoreCase(word2)) {
            System.out.println("대소문자는 다른 것을 허용함 !");
        }
    }

    private static void basicNumberComparison() {
        int number1 = 100;
        int number2 = 50;

        if (number1 > number2) {
            System.out.println("number1>number2");
        }
    }
}
