package kosta.basic.day003;

import java.io.IOException;

public class LoopExam02 {
    public static void main(String[] args) throws IOException {

    }

    private static void printStar() {
        // 별을 찍어보자

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void calculateEquation(int a, int b) {
        // 4x + 5y = 60 -> x, y의 모든 경우의 수를 구해보자

        for (int x = 0; x <= 60 / a; x++) {
            for (int y = 0; y <= 60 / b; y++) {
                if (a * x + b * y == 60) {
                    System.out.printf("x: %d, y: %d\n", x, y);
                }
            }
        }
    }

    private static void multiplicationTable() {
        // TODO: 구구단 9단을 만들어보자

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d= %d\n", i, j, i * j);
            }
        }
    }
}
