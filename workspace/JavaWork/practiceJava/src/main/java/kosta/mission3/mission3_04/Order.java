package kosta.mission3.mission3_04;

import java.util.Scanner;

public class Order {

    public static final Scanner SCANNER = new Scanner(System.in);
    private final String foodRequested;

    public Order() {
        this.foodRequested = InputView.requestOrder();
    }

    public String getFoodRequested() {
        return foodRequested;
    }
}
