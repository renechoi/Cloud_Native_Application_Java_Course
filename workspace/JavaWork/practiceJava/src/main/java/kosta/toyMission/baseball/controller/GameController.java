package kosta.toyMission.baseball.controller;

import kosta.toyMission.baseball.domain.computer.Computer;
import kosta.toyMission.baseball.domain.game.BaseballGame;
import kosta.toyMission.baseball.domain.game.HelpCommandException;
import kosta.toyMission.baseball.domain.game.invalidRetryCommandException;
import kosta.toyMission.baseball.ui.inputView.InputView;
import kosta.toyMission.baseball.ui.outputView.OutputView;

public class GameController {
    public static final int BASEBALL_NUMBER_START_INCLUSIVE = 1;
    public static final int BASEBALL_NUMBER_END_INCLUSIVE = 9;
    public static int BASEBALL_SIZE = 3;
    public static final String HINT_DIAL = "#";
    public static final String CHEAT_KEY_DIAL = "##";
    public static String PREVIOUS_HELP_COMMAND ="";

    public void run() {
        OutputView.printStartMessage();
        setGameLevel();
        OutputView.printLevelInfoMessage();

        Computer computer = Computer.createBaseball();
        BaseballGame baseballGame = new BaseballGame(computer);

        play(baseballGame);
        retry(baseballGame);
    }

    private void play(BaseballGame baseballGame) {
        try {
            baseballGame.round();
        } catch (HelpCommandException e) {
            baseballGame.handleHelp();
            play(baseballGame);
        }
    }

    private void setGameLevel() {
        OutputView.printRequestLevelMessage();
        try {
            BASEBALL_SIZE = validateLevel(parseLevel(InputView.getGameLevelCommand())) + 2;
        } catch (invalidLevelCommandException e) {
            setGameLevel();
        }
    }

    private void retry(BaseballGame baseballGame) {
        OutputView.printSuccessMessage(baseballGame.getRoundCounts());
        OutputView.printRetryMessage();
        if (validateRetry(parseRetry(InputView.getRetryCommand())) == 1) {
            return;
        }
        run();
    }

    private int parseLevel(String levelCommand) {
        try {
            return Integer.parseInt(levelCommand);
        } catch (NumberFormatException e) {
            throw new invalidLevelCommandException(invalidLevelCommandException.LEVEL_NOT_NUMBER);
        }
    }

    private int parseRetry(String retryCommand) {
        try {
            return Integer.parseInt(retryCommand);
        } catch (NumberFormatException e) {
            throw new invalidRetryCommandException(invalidRetryCommandException.RETRY_NOT_NUMBER);
        }
    }

    private int validateLevel(int levelCommand) {
        if (!(levelCommand >= 1 && levelCommand <= 3)) {
            throw new invalidLevelCommandException(invalidLevelCommandException.LEVEL_NOT_IN_RANGE);
        }
        return levelCommand;
    }

    private int validateRetry(int retryCommand) {
        if (!(retryCommand == 0 || retryCommand == 1)) {
            throw new invalidRetryCommandException(invalidRetryCommandException.RETRY_NOT_IN_RANGE);
        }
        return retryCommand;
    }
}
