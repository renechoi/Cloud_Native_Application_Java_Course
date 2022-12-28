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

        try {
            account.withdraw(20000);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        Account account2 = new Account();
        account2.accountNo = "222 - 222";
        account2.ownerName = "김길동";
        account2.balance = 20000;

        System.out.println(account.accountNo);
        System.out.println(account2.accountNo);
        System.out.println(account.ownerName);
        System.out.println(account2.ownerName);

    }
}
