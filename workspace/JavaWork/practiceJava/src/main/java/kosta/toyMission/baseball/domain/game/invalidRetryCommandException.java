package kosta.toyMission.baseball.domain.game;

import kosta.toyMission.baseball.ui.outputView.OutputView;

public class invalidRetryCommandException extends IllegalArgumentException{

    public static final String RETRY_NOT_IN_RANGE= "OOPS! 재도전은 1 or 2 숫자 중 선택하세요!";
    public static final String RETRY_NOT_NUMBER= "OOPS! 재도전은 숫자만 입력해주세요!";

    public invalidRetryCommandException(String message){
        super(message);
        OutputView.printExceptionMessage(message);
    }
}
