package kosta.mission2.Mission2_10.bank.ui;

public class InvalidNumberInputException extends IllegalArgumentException{
    public static final String NOT_A_NUMBER_EXCEPTION = "숫자만 입력하세요!";

    public InvalidNumberInputException(String message) {
        super(message);
        OutputView.consolePrint(message);
    }
}
