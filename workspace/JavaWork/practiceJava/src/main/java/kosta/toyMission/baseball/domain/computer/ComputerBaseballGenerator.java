package kosta.toyMission.baseball.domain.computer;

import java.util.*;

public class ComputerBaseballGenerator {

    private final ComputerNumberGenerator computerNumberGenerator;
    private final int BASEBALL_SIZE = 3;

    public ComputerBaseballGenerator(ComputerNumberGenerator computerNumberGenerator) {
        this.computerNumberGenerator = computerNumberGenerator;
    }

    public Baseball makeBaseball(int size) {
        Set<Integer> ballNumbersRaw = new HashSet<>();

        while (ballNumbersRaw.size() != BASEBALL_SIZE){
            int numberGenerated = computerNumberGenerator.generateRandomNumber();
            ballNumbersRaw.add(numberGenerated);
        }

        return new Baseball(new ArrayList<>(ballNumbersRaw));
    }

}
