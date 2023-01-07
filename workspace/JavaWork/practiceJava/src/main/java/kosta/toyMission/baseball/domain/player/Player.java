package kosta.toyMission.baseball.domain.player;

import kosta.toyMission.baseball.domain.computer.Baseball;

public class Player {

    private Baseball baseball;

    public Player() {
    }

    public Player(Baseball baseball) {
        this.baseball = baseball;
    }

    public static Player getPlayerBaseball() {
        BaseballReceiver baseballReceiver = new BaseballReceiver();
        Baseball playerBaseball = baseballReceiver.receivePlayerBaseball();
        return new Player(playerBaseball);
    }

    public Baseball getBaseball() {
        return baseball;
    }
}
