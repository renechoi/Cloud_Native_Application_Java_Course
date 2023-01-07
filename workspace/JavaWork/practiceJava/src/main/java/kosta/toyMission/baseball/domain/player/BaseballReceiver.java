package kosta.toyMission.baseball.domain.player;

import kosta.toyMission.baseball.GameController;
import kosta.toyMission.baseball.domain.computer.Baseball;
import kosta.toyMission.baseball.ui.inputView.InputView;
import kosta.toyMission.baseball.ui.inputView.invalidPlayerRawInputException;

import java.util.ArrayList;
import java.util.List;

public class BaseballReceiver {

    public Baseball receivePlayerBaseball(int baseballSize) {
        List<Integer> playerNumbers = new ArrayList<>();

        try {
            formatAsBaseball(baseballSize, getPlayerNumbers(baseballSize), playerNumbers);
            return new Baseball(playerNumbers);
        } catch (invalidPlayerNumberFormatException | invalidPlayerRawInputException e) {
            return receivePlayerBaseball(baseballSize);
        }
    }

    private String getPlayerNumbers(int baseballSize) {
        return validateDigits(InputView.getPlayerNumbers(), baseballSize);
    }

    private void formatAsBaseball(int baseballSize, String numberReceived, List<Integer> playerNumbers) {
        int[] numbersEach = numberReceived.chars().map(Character::getNumericValue).toArray();

        for (int i = 0; i < baseballSize; i++) {
            int eachDigit = numbersEach[i];
            validateEachNumber(eachDigit, playerNumbers);
            playerNumbers.add(eachDigit);
        }
    }

    private String validateDigits(String numberReceived, int baseballSize) {
        if (!isDigitCorrect(numberReceived, baseballSize)) {
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

    private static boolean isDigitCorrect(String numberReceived, int baseballSize) {
        return numberReceived.length() == baseballSize;
    }

    private boolean isDuplicateExist(int number, List<Integer> playerNumbers) {
        return playerNumbers.contains(number);
    }

    private boolean isCorrectRanged(int number) {
        return number >= GameController.BASEBALL_NUMBER_START_INCLUSIVE
                && number <= GameController.BASEBALL_NUMBER_END_INCLUSIVE;
    }
}
