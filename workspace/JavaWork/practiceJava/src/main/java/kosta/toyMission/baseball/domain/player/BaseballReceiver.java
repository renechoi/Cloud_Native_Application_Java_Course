package kosta.toyMission.baseball.domain.player;

import kosta.toyMission.baseball.controller.GameController;
import kosta.toyMission.baseball.domain.computer.Baseball;
import kosta.toyMission.baseball.domain.game.HelpCommandException;
import kosta.toyMission.baseball.ui.inputView.InputView;
import kosta.toyMission.baseball.ui.inputView.invalidPlayerRawInputException;

import java.util.ArrayList;
import java.util.List;

public class BaseballReceiver {

    public Baseball receivePlayerBaseball() {
        List<Integer> playerNumbers = new ArrayList<>();

        try {
            formatAsBaseball(getPlayerNumbers(), playerNumbers);
            return new Baseball(playerNumbers);
        } catch (invalidPlayerNumberFormatException | invalidPlayerRawInputException e) {
            return receivePlayerBaseball();
        }
    }

    private String getPlayerNumbers() {
        String playerNumbers = InputView.getPlayerNumbers();
        if (GameController.HINT_DIAL.equals(playerNumbers) || GameController.CHEAT_KEY_DIAL.equals(playerNumbers)){
            GameController.PREVIOUS_HELP_COMMAND = playerNumbers;
            throw new HelpCommandException();
        }
        return validateDigits(playerNumbers);
    }

    private void formatAsBaseball(String numberReceived, List<Integer> playerNumbers) {
        int[] numbersEach = numberReceived.chars()
                .map(Character::getNumericValue)
                .toArray();

        for (int i = 0; i < GameController.BASEBALL_SIZE; i++) {
            int eachDigit = numbersEach[i];
            validateEachNumber(eachDigit, playerNumbers);
            playerNumbers.add(eachDigit);
        }
    }

    private String validateDigits(String numberReceived) {
        if (!isDigitCorrect(numberReceived)) {
            throw new invalidPlayerNumberFormatException(invalidPlayerNumberFormatException.NUMBER_NOT_IN_PROPER_DIGIT);
        }
        return numberReceived;
    }

    private void validateEachNumber(int number, List<Integer> playerNumbers) {
        if (!isCorrectRanged(number)) {
            throw new invalidPlayerNumberFormatException(invalidPlayerNumberFormatException.NUMBER_NOT_IN_RANGE_EXCEPTION);
        }

        if (isDuplicateExist(number, playerNumbers)) {
            throw new invalidPlayerNumberFormatException(invalidPlayerNumberFormatException.NUMBER_DUPLICATE_EXCEPTION);
        }
    }

    private static boolean isDigitCorrect(String numberReceived) {
        return numberReceived.length() == GameController.BASEBALL_SIZE;
    }

    private boolean isDuplicateExist(int number, List<Integer> playerNumbers) {
        return playerNumbers.contains(number);
    }

    private boolean isCorrectRanged(int number) {
        return number >= GameController.BASEBALL_NUMBER_START_INCLUSIVE
                && number <= GameController.BASEBALL_NUMBER_END_INCLUSIVE;
    }
}
