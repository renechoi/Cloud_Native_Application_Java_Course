package kosta.mission2.Mission2_10.bank.customer;

import kosta.mission2.Mission2_10.bank.ui.OutputView;

public class CheckingAccount extends Account {

    private String checkingAccountNo;

    public CheckingAccount() {
    }

    public CheckingAccount(String id, long balance) {
        super(id, balance);
        this.checkingAccountNo = super.getId();
    }

    public void payDebitCard(String checkingAccountNo, long amount) {
        if (this.checkingAccountNo.equals(checkingAccountNo)){
            super.withdraw(amount);
            OutputView.consolePrint(OutputView.PAYMENT_SUCCESS);
            return;
        }
        OutputView.consolePrint(OutputView.PAYMENT_NOT_SUCCESS);
    }
}

