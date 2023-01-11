package kosta.mission3.mission3_04;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public static List<Food> menu = new ArrayList<>();

    private static void createFood(String foodName, int price) {
        menu.add(new Food(foodName, price));
    }

    public static void openStore() {
        createFood("참치김밥", 3500);
        createFood("불고기김밥", 4000);
        createFood("라면", 4500);
        createFood("김치볶음밥", 5500);
        createFood("짜장면", 4300);
        createFood("더블비트트칠리버거", 9500);
        createFood("블랙어니언와퍼", 8900);
        showOpenMessage();
    }

    private static void showOpenMessage() {
        System.out.print(String.format("""
                <객체킹 음식점>
                메뉴 종류 : %s
                """, retrieveMenu()));
    }

    private static String retrieveMenu() {
        StringBuilder stringBuilder = new StringBuilder();
        menu.forEach(food -> stringBuilder.append(food.getName()).append(" "));
        return stringBuilder.toString();
    }
}
