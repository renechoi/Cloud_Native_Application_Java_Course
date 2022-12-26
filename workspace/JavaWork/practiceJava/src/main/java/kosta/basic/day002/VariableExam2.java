package kosta.basic.day002;

public class VariableExam2 {
    public static void main(String[] args) {
        // 지역 변수 (local variable)

        int number = 0;
        int number2 = number + 1;

        if (number2 == 1) {
            int number3 = 100;
        }

//        System.out.println(number3); // number3를 if문 내에서 선언했기 때문에 바깥에서 사용할 수 없다.


        int number4 = 0;
        if (number2 == 1) {
            number4 = 100;
        }

        System.out.println(number4);    // 선언을 바깥에서 해주었기 때문에 사용이 가능하다.


        // 마찬가지로 for문 연산을 사용하려면 바깥에서 선언해준다.
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        System.out.println("최종결과:" + sum);

        int i = 1;
        for (; i <= 10; i++) {
            System.out.println("i:" + i);
        }

        System.out.println("i:" + i);

    }
}
