package kosta.selfMission.others.functionalProgramming;

import java.util.List;

public class FpBasics {
    public static void main(String[] args) {

        List<String> lists = List.of("Apple", "Banana", "Cat", "Dog", "Bat");

        summationWithFp();

    }

    private static void summationWithFp() {
        /**
         * 기존의 for문을 이용한 sum을 구할 때와는 달리
         * local variable이나 mutations, loop 등을 신경쓸 필요 없다
         * Fp는 그저 명령할 뿐이다
         *
         * 또한 명령을 수행함에 있어 구체적인 방법을 정하지 않는다
         * just saying what to do and not how to do
         */

        List<Integer> numbers = List.of(4, 5, 6, 7, 8, 3, 15);
        int sum = numbers.stream()
                .filter(v -> v % 2 == 0)
                .reduce(0, (number1, number2) -> number1 + number2);
    }

    private static void printWithFiltering(List<String> lists) {
//        for (String string : lists){
//            if (string.endsWith("at")){
//                System.out.println(string);
//            }
//        }

        lists.stream()
                .filter(element -> element.endsWith("at"))
                .forEach(System.out::println);

        List<Integer> numbers = List.of(1, 4, 5, 7, 8, 9, 10, 13);
        numbers.stream().filter(v -> v % 2 == 0).forEach(System.out::println);
    }


    private static void printWithFp(List<String> lists) {
        /**
         * 함수형 프로그래밍의 특징은 함수를 일급 시티즌으로 대우한다는 것이다
         * stream에서 for each로 element를 돌면서 데이터를 보내는 것이 아니라 함수, 즉 action을 보낸다
         * function을 sending 한다 !
         */


        lists.stream().forEach(System.out::println);
        lists.stream().forEach(element -> System.out.println(element));
    }

    private static void printBasic(List<String> lists) {
        for (String element : lists) {
            System.out.println(element);
        }
    }
}
