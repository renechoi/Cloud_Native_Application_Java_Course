package kosta.selfMission.burgerHouse;

public class Main {

    public static void main(String[] args) {
        Item item = new Item("coke", "drink", 2000);
        item.printItem();

        Item item2 = new Item("cheese burger", "burger", 4500);
        item2.setSize("LARGE");
        item2.printItem();

    }

}
