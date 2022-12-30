package kosta.mission2.mission2_06.solution1;

public class Account {
    String accountName;
    int amount;

    Account(){
    }

    Account(String accountName){
        this.accountName = accountName;
    }

    public Account(String accountName, int amount) {
        this.accountName = accountName;
        this.amount = amount;
    }

    public Account(int amount) {
        this.amount = amount;
    }

    public String getAccountName() {
        return accountName;
    }
}
