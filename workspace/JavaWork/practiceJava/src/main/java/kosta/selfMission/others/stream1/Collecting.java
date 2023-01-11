package kosta.selfMission.others.stream1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collecting {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 500, Dish.Type.MEAT),
                new Dish("frenchFries", false, 300, Dish.Type.OTHER),
                new Dish("rice", true, 400, Dish.Type.MEAT),
                new Dish("season", false, 500, Dish.Type.MEAT),
                new Dish("pizza", true, 200, Dish.Type.MEAT),
                new Dish("prawns", false, 100, Dish.Type.FISH),
                new Dish("salmon", false, 800, Dish.Type.FISH)
        );

        Map<Dish.Type, List<Dish>> dishesByType = menu.stream().collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishesByType);
    }
}
