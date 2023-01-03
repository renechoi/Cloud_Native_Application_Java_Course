package kosta.selfMission.burgerHouse;

public class Burger extends Item {
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price) {
        super(name, "burger", price);
    }

    private double getExtraPrice(String toppingName) {
        return switch (toppingName.toLowerCase()) {
            case "avocado", "bacon" -> 2000;
            case "lettuce", "mayo" -> 1500;
            default -> 0;
        };
    }

    public void addToppings(String topping1, String topping2, String topping3) {
        this.extra1 = new Item(topping1, "topping", getExtraPrice(topping1));
        this.extra2 = new Item(topping2, "topping", getExtraPrice(topping2));
        this.extra3 = new Item(topping3, "topping", getExtraPrice(topping3));
    }

    @Override
    public String getName() {
        return super.getName() + " " + "burger";
    }

    @Override
    public double getBasePrice() {
        return super.getBasePrice();
    }

    @Override
    public double getAdjustedPrice() {
        return super.getAdjustedPrice()
                + (extra1 == null ? 0 : extra1.getAdjustedPrice())
                + (extra2 == null ? 0 : extra2.getAdjustedPrice())
                + (extra2 == null ? 0 : extra3.getAdjustedPrice());
    }


    @Override
    public void setSize(String size) {
        super.setSize(size);
    }
}
