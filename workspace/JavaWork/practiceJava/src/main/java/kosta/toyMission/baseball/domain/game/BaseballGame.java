package kosta.toyMission.baseball.domain.game;

import kosta.toyMission.baseball.GameController;
import kosta.toyMission.baseball.domain.computer.Computer;
import kosta.toyMission.baseball.domain.player.Player;
import kosta.toyMission.baseball.ui.outputView.OutputView;

import java.util.ArrayList;
import java.util.List;

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
        List<Integer> computers = computer.getBaseball().toNumbers();
        List<Integer> players = player.getBaseball().toNumbers();

        if (GameController.PREVIOUS_HELP_COMMAND.equals(GameController.HINT_DIAL)) {
            List<String> hints = new ArrayList<>();

            for (int i = 0; i < GameController.BASEBALL_SIZE; i++) {
                String hint = computers.get(i) > players.get(i) ? "up" :
                        (computers.get(i) < players.get(i) ? "down" : "equal");
                hints.add(hint);
            }
            OutputView.printHintMessage2(hints);
            roundCounts++;
        }

        if (GameController.PREVIOUS_HELP_COMMAND.equals(GameController.CHEAT_KEY_DIAL)) {
            OutputView.printCheatKeyMessage2(computers.get(0));
            roundCounts++;
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

    public int getRoundCounts() {
        return roundCounts;
    }

    public void setCountsBack() {
        this.roundCounts = roundCounts - 1;
    }
}
