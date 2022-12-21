package kosta.mission;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Mission02 {
    public static void main(String[] args) {
        // TODO 성적관리 프로그램을 구현하자
        // 국어, 영어, 수학 성적을 입력받은 후
        // 총점과 평균을 출력해 보자.

        int korean= 80;
        int english= 90;
        int math= 95;

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

    public class inputView{
        public int getInput(){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            return 0;
        }
    }
}
