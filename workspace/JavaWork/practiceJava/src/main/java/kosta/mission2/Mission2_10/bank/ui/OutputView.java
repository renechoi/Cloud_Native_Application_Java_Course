package kosta.mission2.Mission2_10.bank.ui;

import kosta.mission2.Mission2_10.bank.customer.Customer;

public class OutputView {

    public static final String INTRO_MESSAGE = """
            
            ****메뉴를 입력하세요****
            1. 고객등록
            2. 고객보기(1명)
            3. 고객전체보기
            4. 고객예금입금
            5. 고객예금출금
            ********************
            >>
            """;

    public static final String REQUEST_ID = "ID를 입력하세요: ";
    public static final String REQUEST_NAME = "이름을 입력하세요: ";
    public static final String REQUEST_AMOUNT = "잔고를 입력하세요: ";
    public static final String ADD_ACCOUNT_SUCCESS = "정상 등록되었습니다!";
    public static final String WITHDRAW_SUCCESS = "정상적으로 출금되었습니다";
    public static final String WITHDRAW_AMOUNT = "출금후 잔고는 %d 입니다";

    public static void consolePrint(String message) {
        System.out.println(message);
    }

    public static void consolePrint(Customer customer) {
        System.out.println(customer);
    }

    public static void consolePrint(String message, Long amount){
        System.out.printf(message, amount, "\n");
    }
}
