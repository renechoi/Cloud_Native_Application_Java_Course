package kosta.basic.java.day017.map;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExercise {
    public static void main(String[] args) {
        // 이름, 점수를 한쌍으로 Map 자료구조를 구현해보자 => 김자바 : 80, 박자바 : 70
        // 1. 시험 응시자만 전체 출력
        // 2. 총점, 평균, 최고점수, 최저점수 : Collections => max(), min()

        Map<String, Integer> scoreRecords = Map.of(
                "김자바", 80,
                "박자바", 70,
                "홍자바", 60,
                "강자바", 50,
                "이자바", 40,
                "최자바", 78,
                "정자바", 73
        );

        //basic solution
        Set<String> key = scoreRecords.keySet();
        System.out.println(key);

        Collection<Integer> scores = scoreRecords.values();
        Iterator<Integer> iterator = scores.iterator();

        System.out.println(scores);

        int total = 0;
        while (iterator.hasNext()){
            total += iterator.next();
        }

        int avg = total / scores.size();
        int max = Collections.max(scores);
        int min = Collections.min(scores);





    }

    private static void printArithmeticStatistics2(Map<String, Integer> scoreRecords) {
        List<Integer> scores = new ArrayList<>(scoreRecords.values());

        int total = 0;
        for (Integer score : scores) {
            total += score;
        }
        int avg = total / scores.size();
        int max = Collections.max(scores);
        int min = Collections.min(scores);
    }

    private static void printArithmeticStatistics(Map<String, Integer> scoreRecords) {
        // get total
        int total = scoreRecords.values().stream().reduce(Integer::sum).get();
        int total2 = scoreRecords.values().stream().mapToInt(integer -> integer).sum();

        // get avg
        int avg = total / scoreRecords.size();

        // get max
        int max = scoreRecords.values().stream().reduce(Integer::max).get();

        // get min
        int min = scoreRecords.values().stream().reduce(Integer::min).get();

        System.out.printf("%s %s %s %s", total, avg, max, min);
    }

    private static void printKeys(Map<String, Integer> scoreRecords) {
        // print out keys
        scoreRecords.keySet().forEach(System.out::println);

        scoreRecords.entrySet().stream().forEach(v -> System.out.println(v.getKey()));
    }
}
