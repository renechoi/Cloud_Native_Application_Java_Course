package kosta.mission.mission02;

import java.util.Scanner;

public class Mission02_2 {
    public static void main(String[] args) {
        // TODO : 성적 관리 프로그램을 배열로 구현해보자
        // 국어, 영어, 수학, 총점, 평균

        int[] scores = new int[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }

        int sum = calculateTotalScore(scores);
        double average = calculateAverage(scores, sum);

        System.out.printf("총점 : %d, 평균 : %.2f\n", sum, average);
    }

    private static int calculateTotalScore(int[] scores){
        int sum =0;
        for (int score : scores){
            sum += score;
        }
        return sum;
    }

    private static double calculateAverage(int[] scores, int sum) {
        return sum / (double) scores.length;
    }
}
