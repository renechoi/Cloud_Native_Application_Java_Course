package kosta.toyMission.baseball.ui.inputView;

import kosta.toyMission.baseball.invalidLevelCommandException;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public static String getPlayerNumbers() {
        System.out.print("숫자를 입력하세요: ");
        return getInput();
    }

    public static int getGameLevel() {
        System.out.print("난이도를 설정합니다(1 ~ 3 중 선택): ");

        try {
            return Integer.parseInt(getInput());
        } catch (NumberFormatException e){
            System.out.println(invalidLevelCommandException.LEVEL_NOT_NUMBER);
            return Integer.parseInt(getInput());
        }
    }

    private static String getInput() {
        return validate(scanner.nextLine());
    }

    private static String validate(String input) {
        if ("".equals(input) || input.isEmpty()) {
            throw new invalidPlayerRawInputException(invalidPlayerRawInputException.INPUT_EMPTY_EXCEPTION);
        }
        return input;
    }
}
