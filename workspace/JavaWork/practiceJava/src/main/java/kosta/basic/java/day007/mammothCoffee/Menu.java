package kosta.basic.java.day007.mammothCoffee;

import java.util.Arrays;

enum Menu {
    AMERICANO("americano", 1900),
    LATTE("latte", 2400);

    private final String beverage;
    private final int price;

    Menu(String beverage, int price){
        this.beverage = beverage;
        this.price = price;
    }

    public static Menu beverageOf(String beverage) {
        return Arrays.stream(Menu.values())
                .filter(items -> items.beverage.equals(beverage))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    public String getBeverage() {
        return beverage;
    }

    public int getPrice() {
        return price;
    }
}
