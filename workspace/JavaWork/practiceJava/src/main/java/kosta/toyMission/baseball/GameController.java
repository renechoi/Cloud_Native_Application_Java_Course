package kosta.toyMission.baseball;

import kosta.toyMission.baseball.domain.computer.Baseball;
import kosta.toyMission.baseball.domain.computer.Computer;
import kosta.toyMission.baseball.domain.computer.ComputerBaseballGenerator;
import kosta.toyMission.baseball.domain.computer.ComputerNumberGenerator;
import kosta.toyMission.baseball.domain.player.BaseballReceiver;
import kosta.toyMission.baseball.domain.player.Player;

public class GameController {
    public static final int BASEBALL_NUMBER_START_INCLUSIVE = 1;
    public static final int BASEBALL_NUMBER_END_INCLUSIVE = 9;
    private final int BASEBALL_SIZE = 3;

    public void play() {

        Computer computer = Computer.createBaseball(BASEBALL_SIZE);
        Baseball computerbaseball = computer.getBaseball();

        Player player = Player.getPlayerBaseball(BASEBALL_SIZE);
        Baseball playerBaseball = player.getBaseball();
        System.out.println(computerbaseball.toNumbers());
        System.out.println(playerBaseball.toNumbers());
    }
}
