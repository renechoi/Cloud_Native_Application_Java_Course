package kosta.mission2.mission2_05.solution1;

import java.util.Arrays;

enum Books {
    JAVA("java", 30000, 25),
    JSP("jsp", 20000, 20),
    ORACLE("oracle", 15000, 15);

    private final String title;
    private final int price;
    private final int discountRate;

    Books(String title, int price, int discountRate) {
        this.title = title;
        this.price = price;
        this.discountRate = discountRate;
    }

    public static Books titleOf(String bookName) {
        return Arrays.stream(Books.values())
                .filter(v -> v.title.equals(bookName))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public int getDiscountRate() {
        return discountRate;
    }
}
