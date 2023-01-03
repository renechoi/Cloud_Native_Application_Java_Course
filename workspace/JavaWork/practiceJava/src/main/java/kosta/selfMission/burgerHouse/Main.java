package kosta.selfMission.burgerHouse;

public class Main {

    public static void main(String[] args) {
        Item item = new Item("coke", "drink", 2500);
        item.printItem();

        Item item2 = new Item("spaghetti", "side", 4500);
        item2.setSize("LARGE");
        item2.printItem();

        Item item3 = new Item("avocado", "topping", 1000);
        item3.printItem();

        Burger burger = new Burger("cheese", 4500);
        burger.addToppings("avocado","lettuce","bacon");
        burger.setSize("LARGE");
        burger.printItem();

    }

}
