package kosta.mission2.mission2_12.baseball;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Baseball baseball = new Baseball();

        int[] inputs = new int[3];
        int strike = 0;
        int ball = 0;
        int count = 0;


        do {
            System.out.println("도전 입력");
            for (int i = 0; i < 3; i++) {
                inputs[i] = scanner.nextInt();
            }
            count++;

            strike = baseball.countStrike(inputs);
            ball = baseball.countBall(inputs);

        } while (strike != 3);

        System.out.println("성공!");
    }
}
