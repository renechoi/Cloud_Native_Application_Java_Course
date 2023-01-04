package kosta.mission2.Mission2_10.bank;

import kosta.mission2.Mission2_10.bank.customer.CheckingAccount;

public class Main2 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount();
        CheckingAccount checkingAccount1 = new CheckingAccount("abc", 1000);
        System.out.println(checkingAccount.getBalance());
        System.out.println(checkingAccount.getId());
        System.out.println(checkingAccount1.getId());

        checkingAccount1.payDebitCard("abc",500);
        checkingAccount1.payDebitCard("abc",1000);


    }
}
