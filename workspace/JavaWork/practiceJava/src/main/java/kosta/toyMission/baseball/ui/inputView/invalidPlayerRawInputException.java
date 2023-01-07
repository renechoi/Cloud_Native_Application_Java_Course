package kosta.toyMission.baseball.ui.inputView;

import kosta.toyMission.baseball.ui.outputView.OutputView;

public class invalidPlayerRawInputException extends IllegalArgumentException{
    public static final String INPUT_EMPTY_EXCEPTION = "OOPS! 입렵값이 비어있습니다!";

    public invalidPlayerRawInputException(String message) {
        super(message);
        OutputView.printExceptionMessage(message);
    }
}
