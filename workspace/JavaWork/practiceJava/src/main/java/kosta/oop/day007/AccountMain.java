package kosta.oop.day007;

public class AccountMain {
    public static void main(String[] args) {
        // 객체 생성하기 !
        // 데이터 타입에 클래스 타입이 있다. = 인스턴스 변수

        Account account = new Account();

        account.accountNo = "111 - 111";
        account.ownerName = "홍길동";
        account.balance = 10000;

        account.deposit(5000);

        account.withdraw(20000);
    }
}
