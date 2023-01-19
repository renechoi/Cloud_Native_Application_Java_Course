package kosta.basic.java.day019.thread.MultithreadExample;

public class Account {

    private String number;
    private String name;
    public long balance;

    public Account(String number, String name, long balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(long balance){}
    public void deposit(long balance){}


}