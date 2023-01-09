package kosta.mission2.mission2_12.baseball;

public class Baseball {
    int[] computers;

    public Baseball() {
        computers = new int[3];
        computers[0] = getRandom();

        do {
            computers[1] = getRandom();
        } while (computers[0] == computers[1]);

        do {
            computers[2] = getRandom();
        } while (computers[0] == computers[2] || computers[1] == computers[2]);

    }

    public int countStrike(int[] inputs) {
        int strike = 0;

        for (int i = 0; i < 3; i++) {
            if (computers[i] == inputs[i]){
                strike++;
            }
        }
        return strike;
    }

    public int countBall(int[] inputs) {
        int ball = 0;
        for (int i = 0; i < 3; i++) {
            if (computers[i] == inputs[(i + 1) % 3]) {
                ball++;
            } else if (computers[i] == inputs[((i + 2) % 3)]) {
             ball++;
            }
        }
        return ball;
    }

    private static int getRandom() {
        return (int) (Math.random() * 9) + 1;
    }
}
