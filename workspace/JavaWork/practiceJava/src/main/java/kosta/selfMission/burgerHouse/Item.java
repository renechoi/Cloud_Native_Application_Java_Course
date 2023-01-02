package kosta.selfMission.burgerHouse;

public class Item {
    private String name;
    private String type;
    private double price;
    private String size = "MEDIUM";

    public Item(String name, String type, double price) {
        this.name = name.toLowerCase();
        this.type = type.toLowerCase();
        this.price = price;
    }

    public String getName() {
        if ("side".equals(type) || "drink".equals(type)) {
            return size + " " + name;
        }
        return name;
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice() {
        return switch (size) {
            case "LARGE" -> getBasePrice() * 120 / 100;
            case "SMALL" -> getBasePrice() * 80 / 100;
            default -> getBasePrice();
        };
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void printItem(String name, double price){
        System.out.printf("%20s %6.2f\n", name, price);
    }

    public void printItem(){
        printItem(getName(), getAdjustedPrice());
    }
}
