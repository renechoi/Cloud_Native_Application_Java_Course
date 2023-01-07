package kosta.toyMission.baseball.domain.game;

import kosta.toyMission.baseball.GameController;
import kosta.toyMission.baseball.domain.computer.Baseball;

import java.util.stream.IntStream;

public class BaseballJudge {

    private final int strikeCount;
    private final int ballCount;
    private final boolean isNoCount;

    public BaseballJudge(Baseball computers, Baseball players) {
        this.strikeCount = countStrike(computers, players);
        this.ballCount = countBalls(computers, players);
        this.isNoCount = isNothing();
    }

    public int countStrike(Baseball computers, Baseball players) {
        return (int) IntStream.range(0, GameController.BASEBALL_SIZE)
                .filter(i -> computers.toNumbers().get(i).equals(players.toNumbers().get(i)))
                .count();
    }

    public int countBalls(Baseball computers, Baseball players) {
        return (int) IntStream.range(0, GameController.BASEBALL_SIZE)
                .filter(i -> !computers.toNumbers().get(i).equals(players.toNumbers().get(i)))
                .filter(i -> computers.toNumbers().stream()
                        .filter(number -> number.equals(players.toNumbers().get(i)))
                        .count() == 1)
                .count();
    }

    private boolean isNothing() {
        return this.ballCount == 0 && this.strikeCount == 0;
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }

    public boolean getIsNoCount() {
        return isNoCount;
    }
}
