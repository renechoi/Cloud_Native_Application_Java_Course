package kosta.toyMission.baseball;

import kosta.toyMission.baseball.domain.computer.Baseball;
import kosta.toyMission.baseball.domain.computer.Computer;
import kosta.toyMission.baseball.domain.computer.ComputerBaseballGenerator;
import kosta.toyMission.baseball.domain.computer.ComputerNumberGenerator;
import kosta.toyMission.baseball.domain.player.Player;

public class GameController {

    private final int BASEBALL_SIZE = 3;

    public void play(){
        Player player = new Player();
        Computer computer = Computer.createBaseball(BASEBALL_SIZE);
        Baseball baseball = computer.getBaseball();



    }
}
