package kosta.basic.sql.day024.account;

public record AccountRecord(int seqId, int deposit, int withdraw, String trDate, int balance) {

    public static AccountRecord of (int seqId, int deposit, int withdraw, String trDate, int balance) {
        return new AccountRecord(seqId, deposit, withdraw, trDate, balance);
    }
}
