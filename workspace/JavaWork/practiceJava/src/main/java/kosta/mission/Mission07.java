package kosta.mission;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mission07 {
    public static void main(String[] args) throws IOException {

        // 갤로그 문제를 풀어보자 !

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(bufferedReader.readLine());
        int testCount = 0;
        while (testCase-- > 0) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());

            int dayCount = 0;
            while (a >= b) {
                dayCount++;
                a = a * 2;
                b = b * 3;
            }

            testCount++;
            System.out.printf("#%d %d\n",testCount, dayCount);
        }
    }
}
