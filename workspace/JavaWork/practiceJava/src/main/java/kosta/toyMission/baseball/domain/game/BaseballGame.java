package kosta.toyMission.baseball.domain.game;

import kosta.toyMission.baseball.GameController;
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

    public void handleHelpCommand() {
        if (roundCounts == HINT_CONDITION) {
            // Todo : create hint info
            OutputView.printHintMessage2();
        }

        if (roundCounts == CHEAT_KEY_CONDITION) {
            // Todo : create cheat key info
            OutputView.printCheatKeyMessage2();
        }
    }

    private void helpPlayer(int roundCounts) {
        if (roundCounts == HINT_CONDITION) {
            OutputView.printHintMessage1(roundCounts);
        }

        if (roundCounts == CHEAT_KEY_CONDITION) {
            OutputView.printCheatKeyMessage1(roundCounts);
        }
    }

    private void createChillingMessage() {

    }

    public Player getPlayer() {
        return player;
    }

    public int getRoundCounts() {
        return roundCounts;
    }

    public void setCountsBack() {
        this.roundCounts = roundCounts - 1;
    }
}
