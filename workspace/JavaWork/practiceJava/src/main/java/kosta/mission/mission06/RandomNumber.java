package kosta.mission.mission06;

import java.util.Random;

public class RandomNumber {

    private final int randomNumber;

    public RandomNumber(int range){
        this.randomNumber = generateRandomNumber(range);
    }

    private static int generateRandomNumber(int range){
        Random random = new Random();
        return random.nextInt(range)+1;
    }

    public int getRandomNumber() {
        return randomNumber;
    }
}
