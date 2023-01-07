package kosta.toyMission.baseball;

import kosta.toyMission.baseball.domain.computer.Computer;
import kosta.toyMission.baseball.domain.computer.ComputerNumberGenerator;
import kosta.toyMission.baseball.domain.player.Player;

public class GameController {

    public void play(){
        Computer computer = new Computer();
        Player player = new Player();

        ComputerNumberGenerator computerNumberGenerator = new ComputerNumberGenerator();
        System.out.println(computerNumberGenerator.generateRandomNumber());

    }
}
