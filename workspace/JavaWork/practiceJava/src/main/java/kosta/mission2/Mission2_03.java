package kosta.mission2;

public class Mission2_03 {
    public static void main(String[] args) {
        // 여러명의 성적을 관리할 수 있는 프로그램을 구현해 보자
        // 번호 국어 영어 수학 총점 평균
        // 1    90 98  91 290 88
        // 2    21 45  43 180 43
        // ======================
        // 평균  80  60  50

        int[][] scoreSubjects = {      // 4 x 3 배열
                {98, 90, 80},
                {90, 98, 91},
                {90, 68, 35},
                {10, 25, 76}
        };

        int row = scoreSubjects.length;
        int column = scoreSubjects[0].length;

        int[][] scoreTotal = new int[row][column + 2];

        for (int i = 0; i < row; i++) {
            int sum = 0;

            for (int j = 0; j < column; j++) {
                int score = scoreSubjects[i][j];
                scoreTotal[i][j] = score;
                sum += score;
            }

            scoreTotal[i][column] = sum;
            scoreTotal[i][column + 1] = sum / column;
        }

        System.out.println("번호  국어 영어 수학  총점  평균");

        int idx = 1;
        for (int[] scores : scoreTotal) {
            System.out.printf("%d    %d  %d  %d  %d  %d\n", idx, scores[0], scores[1], scores[2], scores[3], scores[4]);
            idx++;
        }

        System.out.println("=========================");

        System.out.print("    ");
        for (int i = 0; i < column; i++) {
            System.out.print(getSubjectSum(scoreTotal, i) + " ");
        }

    }

    private static int getSubjectSum(int[][] scoreTotal, int subjectIdx) {
        int subjectSum = 0;
        for (int[] subjects : scoreTotal) {
            subjectSum += subjects[subjectIdx];
        }
        return subjectSum;
    }
}
