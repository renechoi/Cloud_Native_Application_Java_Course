package kosta.toyMission.baseball.domain.game;

import kosta.toyMission.baseball.GameController;
import kosta.toyMission.baseball.domain.computer.Computer;
import kosta.toyMission.baseball.domain.player.Player;
import kosta.toyMission.baseball.ui.outputView.OutputView;

public class BaseballGame {

    private final Computer computer;
    private Player player;
    private BaseballJudge baseballJudge;
    private int roundCounts;

    public BaseballGame(Computer computer) {
        this.computer = computer;
    }

    public void round() {
        OutputView.printLevelMessage();
        do {
            roundCounts++;
            this.player = Player.getPlayerBaseball();
            this.baseballJudge = new BaseballJudge(computer.getBaseball(), player.getBaseball());

            OutputView.printResultMessage(baseballJudge.getIsNoCount(), baseballJudge.getStrikeCount(), baseballJudge.getBallCount());
            OutputView.printTrialMessage(roundCounts);
        } while (!isPlayerWin());
    }

    private boolean isPlayerWin() {
        return baseballJudge.getStrikeCount() == GameController.BASEBALL_SIZE;
    }

    private void handleHint(){

    }

    private void handleCheatKey(){

    }

    private void helpPlayer(){

    }

    private void createChillingMessage(){

    }
}
