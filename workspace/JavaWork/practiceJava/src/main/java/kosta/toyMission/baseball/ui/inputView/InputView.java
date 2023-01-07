package kosta.toyMission.baseball.ui.inputView;

import java.util.Scanner;

public class InputView {

    private static final Scanner SCANNER = new Scanner(System.in);
    public static final String REQUEST_PLAYER_NUMBER = "\n숫자를 입력하세요: ";


    public static String getPlayerNumbers() {
        System.out.print(REQUEST_PLAYER_NUMBER);
        return getInput();
    }

    public static String getGameLevelCommand() {
        return getInput();
    }

    public static String getRetryCommand() {
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
