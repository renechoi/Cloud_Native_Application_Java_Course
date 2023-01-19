package kosta.basic.java.day018.io;

import java.io.Serializable;

public class Member implements Serializable {

    private String name;
    private int price;

    public Member(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

