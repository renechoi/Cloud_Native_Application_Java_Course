package kosta.mission2.mission2_05.solution2;

public class Book {
    // 상태 : 책이름, 정가, 할인된 가격
    // 기능 : 할인된 가격을 산출, 책 정보 출력

    String bookName;
    int price;
    int discountedPrice;

    private static final String notificationEach = "%s 교재는 정가는 %d원, 할인된 가격은 %d원 입니다.\n";
    private static final String notificationTotal = "총금액 %d원\n";

    Book() {
    }

    public Book(String bookName, int price) {
        this.bookName = bookName;
        this.price = price;

    }

    public void discount() {
        if (price >= 30000) {
            this.discountedPrice = calculatePrice(price, 25);
            return;
        }
        if (price >= 15000) {
            this.discountedPrice = calculatePrice(price, 20);
            return;
        }
        this.discountedPrice = calculatePrice(price, 15);
    }

    public void printEach(){
        System.out.printf(notificationEach, bookName, price, discountedPrice);
    }

    public int calculatePrice(int price, int discountedPrice) {
        return price * (100 - discountedPrice) / 100;
    }

}
