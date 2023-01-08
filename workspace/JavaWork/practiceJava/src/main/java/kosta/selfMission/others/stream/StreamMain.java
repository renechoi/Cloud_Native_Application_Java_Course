package kosta.selfMission.others.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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

        externalLoopVsInternalLoop(menu);


    }

    private static void externalLoopVsInternalLoop(List<Dish> menu) {
        List<String> names = new ArrayList<>();
        for (Dish dish: menu){             // 메뉴 리스트를 명시적으로 순차 반복한다.
            names.add(dish.getName());    // 이름을 추출해서 리스트에 추가한다.

        }


        Iterator<Dish> iterator = menu.iterator();
        while (iterator.hasNext()){         // 명시적 반복
            Dish dish = iterator.next();
            names.add(dish.getName());
        }

        // 스트림의 내부 반복
        List<String> names2 = menu.stream()
                .map(Dish::getName)
                .toList();
    }

    private static void streamExample1() {
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
