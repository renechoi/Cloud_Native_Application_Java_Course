package kosta.toyMission.baseball.domain.computer;

import java.util.*;

public class ComputerBaseballGenerator {

    private final ComputerNumberGenerator computerNumberGenerator;

    public ComputerBaseballGenerator(ComputerNumberGenerator computerNumberGenerator) {
        this.computerNumberGenerator = computerNumberGenerator;
    }

    public Baseball makeBaseball(int baseballSize) {
        Set<Integer> ballNumbersRaw = new HashSet<>();

        while (ballNumbersRaw.size() != baseballSize){
            int numberGenerated = computerNumberGenerator.generateRandomNumber();
            ballNumbersRaw.add(numberGenerated);
        }

        return new Baseball(new ArrayList<>(ballNumbersRaw));
    }

}
