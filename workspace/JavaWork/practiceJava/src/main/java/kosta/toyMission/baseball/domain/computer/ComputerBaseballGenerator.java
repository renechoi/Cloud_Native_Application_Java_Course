package kosta.toyMission.baseball.domain.computer;

import kosta.toyMission.baseball.controller.GameController;

import java.util.*;

public class ComputerBaseballGenerator {

    private final ComputerNumberGenerator computerNumberGenerator;

    public ComputerBaseballGenerator(ComputerNumberGenerator computerNumberGenerator) {
        this.computerNumberGenerator = computerNumberGenerator;
    }

    public Baseball makeBaseball() {
        Set<Integer> ballNumbersRaw = new HashSet<>();

        while (ballNumbersRaw.size() != GameController.BASEBALL_SIZE){
            int numberGenerated = computerNumberGenerator.generateRandomNumber();
            ballNumbersRaw.add(numberGenerated);
        }

        return new Baseball(new ArrayList<>(ballNumbersRaw));
    }

}
