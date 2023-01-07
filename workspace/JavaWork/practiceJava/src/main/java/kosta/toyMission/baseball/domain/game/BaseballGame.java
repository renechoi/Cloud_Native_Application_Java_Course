package kosta.toyMission.baseball.domain.game;

import kosta.toyMission.baseball.domain.computer.Baseball;
import kosta.toyMission.baseball.domain.computer.Computer;
import kosta.toyMission.baseball.domain.player.Player;

public class BaseballGame {
    private Computer computer;
    private Player player;
    private BaseballJudge baseballJudge;
    private int roundCounts;

    public BaseballGame(Computer computer) {
        this.computer = computer;
    }

    public void round() {
        do {
            roundCounts++;
            this.player = Player.getPlayerBaseball(3);
            Baseball playerBaseball = player.getBaseball();
            this.baseballJudge = new BaseballJudge(computer.getBaseball(), player.getBaseball());
            System.out.print(baseballJudge.getResultMessage());

        } while (!isPlayerWin());

    }

    private boolean isPlayerWin() {
        return baseballJudge.getStrikeCount() == 3;
    }
}
