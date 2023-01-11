package kosta.mission3.mission3_04;

public class Order {

    private final String foodRequested;

    public Order() {
        this.foodRequested = InputView.requestOrder();
    }

    public String getFoodRequested() {
        return foodRequested;
    }
}
