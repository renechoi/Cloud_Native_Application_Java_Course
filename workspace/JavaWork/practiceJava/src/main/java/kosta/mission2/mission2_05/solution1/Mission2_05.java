package kosta.mission2.mission2_05.solution1;

public class Mission2_05 {
    //TODO : 책값을 계산하는 프로그램을 만들어보자
    //교재 JAVA, JSP, Oracle 각각 가격이 30000, 20000, 15000 dlek.
    // 교재 Dc는 30000 원 이상 25% 할인
    // 15000원 이상은 20% 할인
    // 15000원 이상은 15% 할인

    // 책값 DC 하는 메서드를 구현한다
    // 책값을 출력하는 메서드도 따로 구현한다

    public static void main(String[] args) {
        BookCalculator bookCalculator = new BookCalculator();

        getResultTotal(
                bookCalculator,
                getResultEach(bookCalculator, "java"),
                getResultEach(bookCalculator, "jsp"),
                getResultEach(bookCalculator, "oracle"));
    }

    private static int getResultEach(BookCalculator bookCalculator, String title) {
        int bookPrice = getBooksPrice(title);
        int bookDiscountedRatio = getBooksDiscountedRatio(title);
        int discountedPrice = bookCalculator.calculatePrice(bookPrice, bookDiscountedRatio);

        OutputView outputView = new OutputView();
        outputView.printEach(title, bookPrice, discountedPrice);

        return discountedPrice;
    }

    private static void getResultTotal(BookCalculator bookCalculator, int... discountPrices) {
        OutputView outputView = new OutputView();
        outputView.printTotal(bookCalculator.calculateTotal(discountPrices));
    }

    private static int getBooksPrice(String title) {
        return Books.titleOf(title).getPrice();
    }

    private static int getBooksDiscountedRatio(String title) {
        return Books.titleOf(title).getDiscountRate();
    }
}
