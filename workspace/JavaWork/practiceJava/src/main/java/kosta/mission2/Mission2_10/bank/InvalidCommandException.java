package kosta.mission2.Mission2_10.bank;

import kosta.mission2.Mission2_10.bank.ui.OutputView;

public class InvalidCommandException extends IllegalArgumentException{

    public static final String INVALID_COMMAND_EXCEPTION = "1 ~ 5 사이의 숫자를 입력하세요!";

    public InvalidCommandException() {
        super(INVALID_COMMAND_EXCEPTION);
        OutputView.consolePrint(INVALID_COMMAND_EXCEPTION);
    }
}
