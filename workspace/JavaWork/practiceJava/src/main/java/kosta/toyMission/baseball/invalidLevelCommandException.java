package kosta.toyMission.baseball;

import kosta.toyMission.baseball.ui.outputView.OutputView;

public class invalidLevelCommandException extends IllegalArgumentException{
    public static final String LEVEL_NOT_IN_RANGE= "난이도는 1 ~ 3 사이의 숫자로만 선택할 수 있습니다!";
    public static final String LEVEL_NOT_NUMBER= "난이도는 숫자만 입력해주세요!";

    public invalidLevelCommandException(String message){
        super(message);
        OutputView.printExceptionMessage(message);
    }
}
