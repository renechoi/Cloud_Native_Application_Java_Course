package kosta.selfMission.others.functionalProgramming;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> lists = List.of("Apple", "Banana", "Cat", "Dog");




    }

    private static void printWithFp(List<String> lists) {
        // 함수형 프로그래밍의 특징은 함수를 일급 시티즌으로 대우한다는 것이다
        // stream에서 for each로 element를 돌면서 데이터를 보내는 것이 아니라 함수, 즉 action을 보낸다
        // function을 sending 한다 !


        lists.stream().forEach(System.out::println);
        lists.stream().forEach(element -> System.out.println(element));
    }

    private static void printBasic(List<String> lists) {
        for (String element : lists){
            System.out.println(element);
        }
    }
}
