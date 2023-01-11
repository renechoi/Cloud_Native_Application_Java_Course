package kosta.mission3.mission3_04;

import java.util.LinkedList;
import java.util.List;

public class DeliveryManager {

    private static final List<Order> orders = new LinkedList<>();

    public DeliveryManager() {
    }

    public void receive(Order order) {
        orders.add(order);
    }

    public void handleOrder() {
        confirmOrders();
        showReceipt();
    }

    private void confirmOrders() {
        System.out.println("\n주문 내역입니다 ^ㅡㅡㅡㅡ^\n");
        orders.forEach(order -> {
                    int price = Store.menu.stream()
                            .filter(food -> food.getName().equals(order.getFoodRequested()))
                            .findFirst()
                            .get()
                            .getPrice();
                    System.out.printf("%s %s \n", order.getFoodRequested(), price);
                }
        );
        InputView.requestConfirm();
    }

    private void showReceipt() {
        int total = orders.stream().mapToInt(order -> {
            return Store.menu.stream()
                    .filter(food -> food.getName().equals(order.getFoodRequested()))
                    .mapToInt(Food::getPrice)
                    .sum();
        }).sum();

        System.out.printf("\n전체 가격 %s원 입니다! 맛 점 하 세 요 !\n", total);
    }
}
