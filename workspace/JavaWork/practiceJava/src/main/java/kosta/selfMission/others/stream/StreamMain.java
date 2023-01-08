package kosta.selfMission.others.stream;

import java.util.*;

public class StreamMain {

    public static void main(String[] args) {



    }

    private static void practiceStreamReducing() {
        int[] numbers = {1,2,3,4,5};
        int sum = 0;
        for (int x : numbers) {
            sum +=x;
        }

        int sum2 = Arrays.stream(numbers).reduce(0, (a,b)-> a+b);
        int sum3 = Arrays.stream(numbers).reduce(0, Integer::sum);


        OptionalInt max = Arrays.stream(numbers).reduce(Integer::max);

        OptionalInt min = Arrays.stream(numbers).reduce(Integer::min);
    }

    private static void practiceFindFirst() {
        List<Integer> someNumbers = Arrays.asList(1,2,3,4,5);
        Optional<Integer> firstSquareDivisibleByThree = someNumbers.stream()
                .map(n -> n * n)
                .filter(n -> n%3 == 0)
                .findFirst(); // 9
    }

    private static void practiceFindAny() {
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

        Optional<Dish> dishes = menu.stream()
                .filter(Dish::isVegetarian)
                .findAny();
//                .ifPresent(dish -> s)
    }

    private static void practiceFlatMap() {
        // 두개의 리스트 [1,2,3] 과 [3,4]가 주어졌을 때
        // (1,3) (1,4) (2,3) (2,4) (3,3) (3,4)를 반환하기

        List<Integer> number1 = Arrays.asList(1, 2, 3);
        List<Integer> number2 = Arrays.asList(3, 4);

        List<int[]> pairs = number1.stream()
                .flatMap(i -> number2.stream()
                        .map(j -> new int[]{i, j}))
                .toList();
    }

    private static void practiceMapping2() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .toList();
    }

    private static void practiceMapping() {
        List<String> words = Arrays.asList("Modern", "java", "in", "action");
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .toList();

        System.out.println(words);
        System.out.println(wordLengths);
    }

    private static void externalLoopVsInternalLoop(List<Dish> menu) {


        List<String> names = new ArrayList<>();
        for (Dish dish : menu) {             // 메뉴 리스트를 명시적으로 순차 반복한다.
            names.add(dish.getName());    // 이름을 추출해서 리스트에 추가한다.

        }


        Iterator<Dish> iterator = menu.iterator();
        while (iterator.hasNext()) {         // 명시적 반복
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
