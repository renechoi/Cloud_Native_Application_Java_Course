package kosta.mission2.mission2_05.solution1;

import java.util.Arrays;

public class BookCalculator {

    BookCalculator() {
    }

    public int calculatePrice(int price, int discountedPrice) {
        return price * (100 - discountedPrice) / 100;
    }

    public int calculateTotal(int... prices){
        return Arrays.stream(prices).sum();
    }

}
