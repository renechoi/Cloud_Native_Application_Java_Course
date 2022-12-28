package kosta.oop.day007.mammothCoffee;

enum Menu {
    AMERICANO("americano", 1900),
    LATTE("latte", 2400);

    private final String beverage;
    private final int price;

    Menu(String beverage, int price){
        this.beverage = beverage;
        this.price = price;
    }

    public String getBeverage() {
        return beverage;
    }

    public int getPrice() {
        return price;
    }
}
