package kosta.basic.java.day012.overidingExample;

import kosta.basic.java.day007.Account;

public class MinusAccount extends Account {

    private int creditLimit;

    public MinusAccount() {
    }

    public MinusAccount(String accountNo, String ownerName, int balance, int creditLimit) {
        super(accountNo, ownerName, balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(int amount) {
        if (getBalance() + creditLimit < amount) {
            throw new IllegalArgumentException("마이너스 한도 초과!");
        }
        setBalance(getBalance() - amount);
    }
}
