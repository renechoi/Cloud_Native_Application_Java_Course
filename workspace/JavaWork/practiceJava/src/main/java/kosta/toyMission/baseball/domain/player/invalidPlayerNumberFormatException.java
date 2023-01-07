package kosta.toyMission.baseball.domain.player;

import kosta.toyMission.baseball.ui.outputView.OutputView;

public class invalidPlayerNumberFormatException extends IllegalArgumentException {

    public static final String NUMBER_NOT_IN_PROPER_DIGIT = "OOPS! 3자리 숫자만 입력하세요!";
    public static final String NUMBER_NOT_IN_RANGE_EXCEPTION = "OOPS! 1 ~ 9 이외의 숫자를 입력했습니다!";
    public static final String NUMBER_DUPLICATE_EXCEPTION = "OOPS! 중복된 숫자를 입력했습니다!";

    public invalidPlayerNumberFormatException(String message) {
        super(message);
        OutputView.printExceptionMessage(message);
    }
}
