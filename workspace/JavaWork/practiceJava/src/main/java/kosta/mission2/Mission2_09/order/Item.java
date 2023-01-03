package kosta.mission2.Mission2_09.order;

public class Item {
    private String modelName;
    private double price;

    public Item(String modelName, double price) {
        this.modelName = modelName;
        this.price = price;
    }

    public String getModelName() {
        return modelName;
    }

    public double getPrice() {
        return price;
    }
}
