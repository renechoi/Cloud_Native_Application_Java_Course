package kosta.mission3.mission3_04;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public static List<Food> foods = new ArrayList<>();

    public static void createFood(String foodName, int price) {
        foods.add(new Food(foodName, price));
    }

    public static void openStore() {
        Store.createFood("참치김밥", 3500);
        Store.createFood("불고기김밥", 4000);
        Store.createFood("라면", 4500);
        Store.createFood("김치볶음밥", 5500);
        Store.createFood("짜장면", 4300);
        Store.createFood("더블비트트칠리버거", 9500);
        Store.createFood("블랙어니언와퍼", 8900);
        showOpenMessage();
    }

    private static void showOpenMessage() {
        System.out.print(String.format("""
                <객체킹 음식점>
                메뉴 종류 : %s
                """, retrieveFoodsNowSelling()));
    }

    private static String retrieveFoodsNowSelling() {
        StringBuilder stringBuilder = new StringBuilder();
        foods.forEach(food -> stringBuilder.append(food.getName()).append(" "));
        return stringBuilder.toString();
    }
}
