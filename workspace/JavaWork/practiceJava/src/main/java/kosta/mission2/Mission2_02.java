package kosta.mission2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mission2_02 {
    public static void main(String[] args) throws IOException {
        // TODO : 보이는 학생
        // 선생님이 N명의 학생을 일렬로 세웠다. 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하자.
        // 크면 보이고 작거나 같으면 보이지 않는다.
        // 입력: 5<=N<=100,000 , 둘째줄부터 N명 학생의 키가 주어진다.

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int students = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int studentCounts = 0;
        int frontStudentHeight = 0;
        for (int i = 0; i < students; i++) {
            int height = Integer.parseInt(stringTokenizer.nextToken());
            if (height > frontStudentHeight) {
                studentCounts++;
                frontStudentHeight = height;
            }
        }
        System.out.println(studentCounts);
    }
}
