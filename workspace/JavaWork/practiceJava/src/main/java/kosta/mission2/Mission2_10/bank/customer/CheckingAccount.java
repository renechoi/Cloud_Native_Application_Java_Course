package kosta.mission2.Mission2_10.bank.customer;

public class CheckingAccount extends Account {

    private int checkingAccountNo;

    public CheckingAccount() {
    }

    public CheckingAccount(String id, long balance) {
        super(id, balance);
    }

    public void payDebitCard(String checkingAccountNo, long amount) {
        super.withdraw(amount);
    }
}

