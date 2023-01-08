package kosta.selfMission.others.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 500, Dish.Type.MEAT),
                new Dish("french fries", false, 300, Dish.Type.OTHER),
                new Dish("rice", true, 400, Dish.Type.MEAT),
                new Dish("season", false, 500, Dish.Type.MEAT),
                new Dish("pizza", true, 200, Dish.Type.MEAT),
                new Dish("prawns", false, 100, Dish.Type.FISH),
                new Dish("salmon", false, 800, Dish.Type.FISH)
        );

        List<String> threeHighCaloricDishNames =
                menu.stream()                           // 메뉴 요리 스트림 생성
                        .filter(dish -> dish.getCalories() > 300)   // 파이프라인 연산 만들기 -> 첫 번째로 고칼로리 요리 필터링
                        .map(Dish::getName)     // 요리명 추출
                        .limit(3)       // 선착순 3개 선택
                        .toList();              // 결과를 다른 리스트에 저장

        System.out.println(threeHighCaloricDishNames);

    }


}
