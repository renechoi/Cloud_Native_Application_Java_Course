package kosta.mission2.Mission2_10.bank.customer;

import kosta.mission2.Mission2_10.bank.ui.OutputView;

public class InvalidCustomerInputException extends Exception {
    public static final String NULL_OR_EMPTY_EXCEPTION = "입력값이 비어있습니다!";
    public static final String INVALID_WORD_EXCEPTION = "입력값은 문자만 입력하세요!";
    public static final String INVALID_NUMBER_UNDER_ZERO = "0 이상의 값을 입력하세요!";

    public InvalidCustomerInputException(String message) {
        super(message);
        OutputView.consolePrint(message);
    }
}
