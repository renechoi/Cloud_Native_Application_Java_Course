package kosta.basic.java.day003;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LoopExam01 {
    public static void main(String[] args) {

    }

    private static void printNotDividedWithContinueStatement() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    private static void getRandomNumber() {
        // random -> 난수(임의의 수)
        // 1. Math.random() -> 0.0 ~ 0.9 // double 형식
        // 2. Random 클래스의 nextInt()를 이용해보자

        // TODO : 주사위의 값을 구해보자

        int randomNumber = (int) (Math.random() * 6) + 1;
        System.out.println(randomNumber);

        Random random = new Random();
        System.out.println(random.nextInt(6));
    }

    private static void printPositiveNumberOnly() {
        // TODO : 2개의 정수를 입력 받아 b-a 결과를 출력하자. 결과는 반드시 양의 정수가 출력되어야 한다.

        while (true) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int calculated = b - a;
            if (calculated < 0) {
                System.out.println("b -a < 0 : 양의 정수가 아님 !");
                continue;
            }
            System.out.println(b - a);
            break;
        }
    }

    private static void findNotDividedTwoAndThree() {
        // TODO : 1~100까지의 숫자 중 2의 배수와 3의 배수가 아닌 숫자만 출력하시오.

        for (int i = 1; i <= 100; i++) {
            boolean isNotDivided = i % 2 != 0 && i % 3 != 0;
            if (isNotDivided) {
                System.out.println(i);
            }
        }

        ArrayList<Integer> test = new ArrayList<>();
        IntStream intStream = IntStream.range(1, 100);
        intStream.filter(integer -> integer % 2 != 0 && integer % 3 != 0)
                .forEach(System.out::print);


        Stream.iterate(1, i -> ++i)
                .filter(integer -> integer % 2 != 0 && integer % 3 != 0)
                .limit(100)
                .filter(integer -> test.add(integer))
                .collect(Collectors.toList());

        System.out.println(Arrays.toString(test.toArray()));

    }

    private static void multiplicationTable() {
        // TODO: 구구단 9단을 만들어보자

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d= %d\n", i, j, i * j);
            }
        }
    }

    private static void practiceSummation() {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.printf("1 ~ 10 까지의 합 : %d", sum);
    }

    private static void twoTimesTable() {
        // 구구단 2단 만들어보기 
        for (int i = 1; i <= 9; i++) {
            System.out.printf("2 * %d = %d\n", i, 2 * i);
        }
    }

    private static void sevenTimesTable() {
        // 구구단 7단 만들어보기

        int i = 1;
        while (i <= 9) {
            System.out.printf("7 * %d = %d\n", i, 7 * i);
            i++;
        }
    }


}
