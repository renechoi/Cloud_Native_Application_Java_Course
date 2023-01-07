package kosta.toyMission.baseball;

import kosta.toyMission.baseball.domain.computer.Computer;
import kosta.toyMission.baseball.domain.game.BaseballGame;
import kosta.toyMission.baseball.ui.inputView.InputView;
import kosta.toyMission.baseball.ui.outputView.OutputView;

public class GameController {
    public static final int BASEBALL_NUMBER_START_INCLUSIVE = 1;
    public static final int BASEBALL_NUMBER_END_INCLUSIVE = 9;
    public static int BASEBALL_SIZE = 3;

    public static final String HINT_DIAL = "#";
    public static final String CHEAT_KEY_DIAL = "##";

    public void play() {
        OutputView.printStartMessage();
        setGameLevel();

        Computer computer = Computer.createBaseball();
        BaseballGame baseballGame = new BaseballGame(computer);
        baseballGame.round();
    }

    private void setGameLevel() {
        try {
            BASEBALL_SIZE = validateLevel(parseInt(InputView.getGameLevel())) + 2;
        } catch (invalidLevelCommandException e) {
            setGameLevel();
        }
    }

    private int parseInt(String levelCommand) {
        try {
            return Integer.parseInt(levelCommand);
        } catch (NumberFormatException e) {
            throw new invalidLevelCommandException(invalidLevelCommandException.LEVEL_NOT_NUMBER);
        }
    }

    private int validateLevel(int levelCommand) {
        if (!(levelCommand >= 1 && levelCommand <= 3)) {
            throw new invalidLevelCommandException(invalidLevelCommandException.LEVEL_NOT_IN_RANGE);
        }
        return levelCommand;
    }
}
