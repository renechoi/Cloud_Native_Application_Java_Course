package kosta.basic.day012.overidingExample;

import kosta.basic.day007.Account;

public class Main {
    public static void main(String[] args) {
        MinusAccount minusAccount = new MinusAccount("111","박길동",1000, 3000);

        try{
        minusAccount.withdraw(2000);
        } catch (Exception ignored){
        }

        System.out.println(minusAccount);

        Account minusAccount2 = new MinusAccount("111","박길동",1000, 3000);
    }
}
