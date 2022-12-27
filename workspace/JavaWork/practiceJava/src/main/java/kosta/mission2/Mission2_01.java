package kosta.mission2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mission2_01 {
    public static void main(String[] args) throws IOException {
        // TODO : N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
        // 첫 번째 수는 무조건 출력
        // 입력 : 첫 줄에 자연수 N이 주어진다(1 ~ 100), 둘째 줄에 N개의 정수가 한 칸씩 주어진다.
        // 출력 : 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numberCounts = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int[] numbers = new int[numberCounts];
        for (int i = 0; i < numberCounts; i++) {
            int number = Integer.parseInt(stringTokenizer.nextToken());
            numbers[i] = number;
            if (i == 0) {
                System.out.print(number + " ");
                continue;
            }

            if (number > numbers[i - 1]) {
                System.out.print(number + " ");
            }
        }

    }
}
