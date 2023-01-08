package kosta.toyMission.baseball.domain.game;

import kosta.toyMission.baseball.controller.GameController;
import kosta.toyMission.baseball.domain.computer.Computer;
import kosta.toyMission.baseball.domain.player.Player;
import kosta.toyMission.baseball.ui.outputView.OutputView;

public class BaseballGame {

    public static final int HINT_CONDITION = 6;
    public static final int CHEAT_KEY_CONDITION = 10;
    private final Computer computer;
    private Player player;
    private BaseballJudge baseballJudge;
    private int roundCounts;

    public BaseballGame(Computer computer) {
        this.computer = computer;
    }

    public void round() {
        do {
            helpPlayer(++roundCounts);

            this.player = Player.getPlayerBaseball();
            this.baseballJudge = new BaseballJudge(computer.getBaseball(), player.getBaseball());

            OutputView.printResultMessage(baseballJudge.getIsNoCount(), baseballJudge.getStrikeCount(), baseballJudge.getBallCount());
        } while (!isPlayerWin());
    }

    private boolean isPlayerWin() {
        return baseballJudge.getStrikeCount() == GameController.BASEBALL_SIZE;
    }

    public void handleHelp() {
        setCountsDown();

        Helper.parseHelp(GameController.PREVIOUS_HELP_COMMAND)
                .provideHelp(computer.getBaseball().toNumbers(), player.getBaseball().toNumbers());

        setCountsUp();
    }

    private void helpPlayer(int roundCounts) {
        if (roundCounts == HINT_CONDITION) {
            OutputView.printHintMessage1(roundCounts);
        }

        if (roundCounts == CHEAT_KEY_CONDITION) {
            OutputView.printCheatKeyMessage1(roundCounts);
        }
    }

    public int getRoundCounts() {
        return roundCounts;
    }

    public void setCountsDown() {
        this.roundCounts = roundCounts - 1;
    }

    public void setCountsUp() {
        this.roundCounts = roundCounts + 1;
    }
}
