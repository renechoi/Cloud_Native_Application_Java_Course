package kosta.basic.day017.map;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Map

        Map<Integer, String> ranks = new HashMap<>();

        ranks.put(1, "SSG");
        ranks.put(2, "키움");
        ranks.put(3, "LG");

        System.out.printf("요소의 사이즈: %s \n", ranks.size());

        if (ranks.containsValue("키움")) {
            ranks.remove(2);
        }

        System.out.printf("요소의 사이즈: %s \n", ranks.size());


        // map을 전체 출력해보자
        // stream으로 리스트 변환하여 추출하는 방법
        System.out.println(Stream.of(ranks).collect(Collectors.toList()));

        // map -> set -> iterator로 변환하는 방법  (사실상 entrySet을 이용한다)

        Set<Map.Entry<Integer, String>> set = ranks.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> rank = iterator.next();
            System.out.printf("%s %s \n", rank.getKey(), rank.getValue());
        }

        for (Map.Entry<Integer, String> rank : ranks.entrySet()) {
            System.out.printf("%s %s \n", rank.getKey(), rank.getValue());

        }


        List<Integer> rankKeys = new ArrayList<>(ranks.keySet());
        List<String> rankValues = new ArrayList<>(ranks.values());

        System.out.println(rankKeys);
        System.out.println(rankValues);

    }
}
