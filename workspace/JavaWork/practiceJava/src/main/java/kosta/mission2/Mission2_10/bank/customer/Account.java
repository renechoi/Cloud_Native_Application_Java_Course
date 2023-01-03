package kosta.mission2.Mission2_10.bank.customer;

import kosta.mission2.Mission2_10.bank.ui.OutputView;

public class Account {
    private String id;
    private long balance;

    public Account() {
    }

    public Account(String id, long balance) {
        this.id = id;
        this.balance = balance;
    }

    public void deposit(long amount) {
        this.balance += amount;
    }

    public void withdraw(long amount) {
        validate(amount);
        this.balance = this.balance - amount;
        OutputView.consolePrint(OutputView.WITHDRAW_SUCCESS);
        OutputView.consolePrint(OutputView.WITHDRAW_AMOUNT, this.balance);
    }

    private void validate(long amount) {
        if (amount > balance) {
            throw new NotEnoughBalanceException();
        }
    }

    public String getId() {
        return id;
    }

    public long getBalance() {
        return balance;
    }

}
