package kosta.oop.day007;

public class Account {
    // 계좌 객체
    // 상태 (특성) : 계좌번호, 계좌주, 잔액  => 멤버 변수 (=필드) ! (지금까지는 지역 변수)
    // 행동 (기능) : 입금하다, 출금하다 => 멤버 메서드

    String accountNo;
    String ownerName;
    int balance;

    public void deposit(int amount){
        balance +=amount;
    }

    public void withdraw(int amount){
        if (balance < amount){
            throw new IllegalArgumentException("balance not enough !!!");
        }
        balance -= amount;
    }
}
