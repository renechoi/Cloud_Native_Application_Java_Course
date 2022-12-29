package kosta.mission2.mission2_06.solution1;

public class AccountMain {
    public static void main(String[] args) {
        // TODO: 계좌 관리 프로그램을 만들어보자
        // 1. 계좌발급
        // 2. 전체출력
        // 3. 계좌조회
        // 4. 계좌입금
        // 5. 계좌출금

        Bank bank = new Bank();

        InputView inputView = new InputView();
        bank.handleCommand(inputView.getInput());

    }
}
