package kosta.toyMission.baseball.domain.player;

import kosta.toyMission.baseball.domain.computer.Baseball;

public class Player {

    private Baseball baseball;

    public Player() {
    }

    public Player(Baseball baseball) {
        this.baseball = baseball;
    }

    public static Player getPlayerBaseball(int baseballSize) {
        BaseballReceiver baseballReceiver = new BaseballReceiver();
        Baseball playerBaseball = baseballReceiver.receivePlayerBaseball(baseballSize);
        return new Player(playerBaseball);
    }

    public Baseball getBaseball() {
        return baseball;
    }
}
