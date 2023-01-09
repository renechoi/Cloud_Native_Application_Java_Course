package kosta.selfMission.others.functionalProgramming;

import java.util.List;
import java.util.stream.IntStream;

public class StreamMiddle {
    public static void main(String[] args) {





    }

    private static void streamMiddles() {
        IntStream.range(1,11).forEach(n->System.out.println(n));
        IntStream.range(1,11).map(e-> e* e).forEach(n->System.out.println(n));


        List.of("Apple", "Ant", "Bat").stream().map(s->s.toLowerCase()).forEach(System.out::println);
        List.of("Apple", "Ant", "Bat").stream().map(s->s.length()).forEach(System.out::println);
    }

    private static void sortDistinctMap() {
        List<Integer> numbers = List.of(3,4,5,6,7,8,9,234,25,74,2);

        numbers.stream().sorted().forEach(System.out::println);

        List<Integer> numbers2 = List.of(3,4,5,62,7,8,3,9,5,9,7,2234,25,74,2);

        numbers2.stream().distinct().sorted().forEach(System.out::println);

        numbers.stream().distinct().map(e->e*e).forEach(System.out::println);
    }
}
