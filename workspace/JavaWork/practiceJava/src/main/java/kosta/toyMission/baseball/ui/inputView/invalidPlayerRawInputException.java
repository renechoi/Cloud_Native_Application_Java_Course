package kosta.toyMission.baseball.ui.inputView;

public class invalidPlayerRawInputException extends IllegalArgumentException{
    public static final String INPUT_EMPTY_EXCEPTION = "입렵값이 비어있습니다!";

    public invalidPlayerRawInputException(String message) {
        super(message);
        System.out.println(message);
    }
}
