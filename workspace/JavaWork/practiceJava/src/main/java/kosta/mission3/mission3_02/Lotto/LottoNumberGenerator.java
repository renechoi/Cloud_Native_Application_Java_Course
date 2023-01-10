package kosta.mission3.mission3_02.Lotto;

public class LottoNumberGenerator implements RandomNumberGenerator{
    private static final int RANDOM_LOWER_INCLUSIVE = 1;
    private static final int RANDOM_UPPER_INCLUSIVE = 45;

    @Override
    public int generateRandomNumber() {
        return (int) (Math.random() * RANDOM_UPPER_INCLUSIVE ) + RANDOM_LOWER_INCLUSIVE;
    }
}
