package kosta.mission;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Mission02 {
    public static void main(String[] args) {
        // TODO 성적관리 프로그램을 구현하자
        // 국어, 영어, 수학 성적을 입력받은 후
        // 총점과 평균을 출력해 보자.

        int korean = 80;
        int english = 90;
        int math = 95;

        int scoreTotal = korean + english + math;
        int scoreAverage = scoreTotal / 3;
        // double 형으로 소수점을 출력하고 싶다면 나누는 것 역시 int가 아니라 double 형식으로 해주어야 한다.
        double scoreAverage2 = scoreTotal / 3.0;
        int scoreAverage3 = (int) (scoreTotal / 3.0);

        System.out.println("총점: " + scoreTotal);
        System.out.println("평균: " + scoreAverage2);
        System.out.println("평균: " + scoreAverage3);


//        int testCasting = (int) 3.14;


//        double testFloatCalculation = 3.14 + 1;
//        if (testFloatCalculation == 4.14){
//            System.out.println("equals");
//        } else {
//            System.out.println("wrong");
//        }


        // 캐스팅 예제 만들기 (정수 <==> 실수)

        long amount = 100000000L;
        double profitRate = 5.5;

        long profitAmount = (long) (amount * profitRate / 100);
        System.out.println(profitAmount);


        // int <==> char (아스키 코드 값)

        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i);
        }

        System.out.println();

        // 정수형 <==> String

        String numberString = "2000";
        int numberInt = Integer.parseInt(numberString);
        System.out.println(numberInt + 1000);

        String numberString2 = "2000한글";
        try {
            int numberInt2 = Integer.parseInt(numberString2);
            System.out.println(numberInt2 + 1000);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }


        int number10 = 100;
        String number11 = String.valueOf(number10);
        String number12 = number10 + "";
        System.out.println(number12);

        //퀴즈
        String string2 = 7 + "7" + 7; // 777
        System.out.println(string2);



        // 입력 받기

        Scanner scanner = new Scanner(System.in);
//        scanner.nextInt();  // 숫자로 입력 받을 때
//        scanner.nextLine(); // 문자로 입력 받을 때

        System.out.println("x: ");
        int x = scanner.nextInt();

        System.out.println("y: ");
        int y = scanner.nextInt();

        System.out.printf("result : %d", x*y);


    }


    public class application {

        public void main(String[] args) {

        }

        private void score() {
        }
    }

    public class score {
        int score;

        public score(int score) {
            this.score = score;
        }
    }

    public class inputView {
        public int getInput() {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            return 0;
        }
    }
}
