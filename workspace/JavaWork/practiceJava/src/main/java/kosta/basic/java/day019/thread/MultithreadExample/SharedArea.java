package kosta.basic.java.day019.thread.MultithreadExample;

public class SharedArea {
    Account account1;
    Account account2;

    public void transfer(int amount) {
        synchronized (this) {
            account1.withdraw(10000L);
            System.out.println("이몽룡 계좌");
            account2.deposit(10000L);
            System.out.println("성춘향 계좌");
        }
    }

    public long getTotal(){
        synchronized (this){
            return account1.balance + account2.balance;
        }
    }
}


