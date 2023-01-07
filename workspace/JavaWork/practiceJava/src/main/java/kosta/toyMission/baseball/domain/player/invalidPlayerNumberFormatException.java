package kosta.toyMission.baseball.domain.player;

public class invalidPlayerNumberFormatException extends IllegalArgumentException {

    public static final String NUMBER_NOT_IN_PROPER_DIGIT = "3자리 숫자만 입력하세요!";
    public static final String NUMBER_NOT_IN_RANGE_EXCEPTION = "1 ~ 9 이외의 숫자를 입력했습니다!";
    public static final String NUMBER_DUPLICATE_EXCEPTION = "중복된 숫자를 입력했습니다!";

    public invalidPlayerNumberFormatException(String message) {
        super(message);
        System.out.println(message);
    }
}
