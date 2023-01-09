package kosta.selfMission.others.functionalProgramming;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> lists = List.of("Apple", "Banana", "Cat", "Dog");




    }

    private static void printWithFp(List<String> lists) {
        lists.stream().forEach(System.out::println);
        lists.stream().forEach(element -> System.out.println(element));
    }

    private static void printBasic(List<String> lists) {
        for (String element : lists){
            System.out.println(element);
        }
    }
}
