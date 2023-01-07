package kosta.toyMission.baseball.domain.computer;

public class ComputerNumberGenerator implements RandomNumberGenerator{
    private static final int RANDOM_LOWER_INCLUSIVE = 1;
    private static final int RANDOM_UPPER_INCLUSIVE = 9;

    @Override
    public int generateRandomNumber() {
        return (int) (Math.random() * RANDOM_UPPER_INCLUSIVE ) + RANDOM_LOWER_INCLUSIVE;
    }
}
