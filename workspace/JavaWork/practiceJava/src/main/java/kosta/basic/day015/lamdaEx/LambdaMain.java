package kosta.basic.day015.lamdaEx;

import java.util.Comparator;
import java.util.stream.IntStream;

public class LambdaMain {
    public static void main(String[] args) {

        AddFunction addFunction = (x, y) -> 1L + 2L;

        Comparator<Integer> byNumber = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };



    }

    private static void lambdaEx1() {
        // 1단계 myType => 익명 내부 클래스로 구현해보자
        // 2단계 lambda
        // 3단계 한 줄 lambda

        MyType myType = new MyType() {
            @Override
            public void hello() {
                System.out.println("this is anonymous class!");
            }
        };


        MyType myType2 = () -> {
            System.out.println("this is lambda expression!");
        };

        myType.hello();
        myType2.hello();

        MyType myType3 = () -> System.out.println("this is lambda expression2!");
    }

    private static void summationEx() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum++;
        }
        System.out.println(sum);

        int sum2 = IntStream.range(1, 10).sum();
        System.out.println(sum2);
    }
}
