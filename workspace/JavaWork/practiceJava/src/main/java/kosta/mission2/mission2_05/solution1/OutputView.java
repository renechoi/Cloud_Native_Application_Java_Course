package kosta.mission2.mission2_05.solution1;

public class OutputView {

    private static final String notificationEach = "%s 교재는 정가는 %d원, 할인된 가격은 %d원 입니다.\n";
    private static final String notificationTotal = "총금액 %d원\n";

    public void printEach(String title, int price, int discountedPrice) {
        System.out.printf(notificationEach, title, price, discountedPrice);
    }

    public void printTotal(int totalPrice) {
        System.out.printf(notificationTotal, totalPrice);
    }
}
