package kosta.selfMission.oop.customerRunner;

public class Customer {
    private String name;
    private Address homeAddress;
    private Address workAddress;

    public Customer() {
    }

    public Customer(String name, Address homeAddress) {
        this.name = name;
        this.homeAddress = homeAddress;
    }
}
