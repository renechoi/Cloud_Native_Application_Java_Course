package kosta.mission2.Mission2_10.bank.ui;

import java.util.Scanner;

public class InputView {

    public static String getInputCommand() {
        OutputView.consolePrint(OutputView.INTRO_MESSAGE);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String getId() {
        OutputView.consolePrint(OutputView.REQUEST_ID);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String getName() {
        OutputView.consolePrint(OutputView.REQUEST_NAME);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static Long getBalance() {
        OutputView.consolePrint(OutputView.REQUEST_AMOUNT);
        Scanner scanner = new Scanner(System.in);
        return Long.parseLong(validate(scanner.nextLine()));
    }

    private static String validate(String userInput) {
        try {
            Integer.parseInt(userInput);
        } catch (NumberFormatException ignored) {
            throw new InvalidNumberInputException(InvalidNumberInputException.NOT_A_NUMBER_EXCEPTION);
        }
        return userInput;
    }
}
