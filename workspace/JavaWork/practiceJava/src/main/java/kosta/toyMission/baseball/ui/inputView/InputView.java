package kosta.toyMission.baseball.ui.inputView;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public static String getPlayerNumbers() {
        System.out.print("숫자를 입력하세요: ");
        return validate(scanner.nextLine().trim());
    }

    private static String validate(String input) {
        if ("".equals(input) || input.isEmpty()) {
            throw new invalidPlayerRawInputException(invalidPlayerRawInputException.INPUT_EMPTY_EXCEPTION);
        }
        return input;
    }
}
