package kosta.selfMission.others.functionalProgramming;

import java.util.List;
import java.util.stream.Stream;

public class MethodReferences {

    public static void print(Integer number) {
        System.out.println(number);
    }

    public static void main(String[] args) {

        // original stream
        List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
                .map(s -> s.length())
                .forEach(s -> System.out.println(s));

        // method referencing
        Stream.of("Ant", "Bat", "Cat", "Dog", "Elephant")
                .map(String::length)            // 인스턴스 레퍼런스
//                .forEach(System.out::println);
                .forEach(MethodReferences::print);  // 메서드 레퍼런스


        Integer max = List.of(23, 45, 50, 55, 60, 68, 70)
                .stream()
                .filter(MethodReferences::isEven)
                .max(Integer::compare)
                .orElse(0);
        System.out.println(max);

    }

    public static boolean isEven(Integer number) {
        return number % 2 == 0;
    }
}
