package kosta.toyMission.baseball.domain.computer;

import java.util.List;

public class Baseball {
    private List<Integer> baseball;

    public Baseball(List<Integer> baseball) {
        this.baseball = baseball;
    }

    public List<Integer> getBaseball() {
        return baseball;
    }
}
