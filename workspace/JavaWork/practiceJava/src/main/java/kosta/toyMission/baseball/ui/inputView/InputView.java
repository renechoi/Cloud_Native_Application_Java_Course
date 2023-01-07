package kosta.toyMission.baseball.ui.inputView;

import java.util.Scanner;

public class InputView {

    private static final Scanner SCANNER = new Scanner(System.in);
    public static final String REQUEST_PLAYER_NUMBER = "\n숫자를 입력하세요: ";
    public static final String SET_GAME_LEVE_MESSAGE = String.format(
            """
            난이도를 설정합니다.
            1 ~ 3 사이 숫자 중 하나를 선택해주세요.
            숫자가 높을수록 어렵습니다!
            ------------------------- 선택:%s""", " ");

    public static String getPlayerNumbers() {
        System.out.print(REQUEST_PLAYER_NUMBER);
        return getInput();
    }

    public static String getGameLevel() {
        System.out.print(SET_GAME_LEVE_MESSAGE);
        return getInput();
    }

    private static String getInput() {
        return validate(SCANNER.nextLine());
    }

    private static String validate(String input) {
        if ("".equals(input) || input.isEmpty()) {
            throw new invalidPlayerRawInputException(invalidPlayerRawInputException.INPUT_EMPTY_EXCEPTION);
        }
        return input;
    }
}
