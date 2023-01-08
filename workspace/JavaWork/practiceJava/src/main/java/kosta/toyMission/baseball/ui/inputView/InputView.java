package kosta.toyMission.baseball.ui.inputView;

import kosta.toyMission.baseball.ui.outputView.OutputView;

import java.util.Scanner;

public class InputView {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static String getPlayerNumbers() {
        OutputView.printRequestBaseballMessage();
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
