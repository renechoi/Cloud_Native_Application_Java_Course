package kosta.toyMission.baseball.domain.game;

import kosta.toyMission.baseball.domain.computer.Baseball;

import java.util.stream.IntStream;

public class BaseballJudge {
    private int strikeCount;
    private int ballCounts;
    private String nothingCounts;
    private String resultMessage;
    private boolean isSuccess;

    public BaseballJudge(Baseball computers, Baseball players) {
        this.strikeCount = countStrike(computers, players);
        this.ballCounts = countBalls(computers, players);
        this.nothingCounts = countNothing();
        this.resultMessage = formatMessage();
    }

    private String countNothing() {
        if (this.ballCounts == 0 && this.strikeCount == 0) {
            return "낫싱";
        }
        return "";
    }

    public int countStrike(Baseball computers, Baseball players) {
        return (int) IntStream.range(0, 3)
                .filter(i -> computers.toNumbers().get(i).equals(players.toNumbers().get(i)))
                .count();
    }

    public int countBalls(Baseball computers, Baseball players) {
        return (int) IntStream.range(0, 3)
                .filter(i -> !computers.toNumbers().get(i).equals(players.toNumbers().get(i)))
                .filter(i -> {
                    return computers.toNumbers().stream()
                            .filter(number -> number.equals(players.toNumbers().get(i)))
                            .count() == 1;
                })
                .count();
    }



    private String formatMessage(){
        return String.format("""
                스트라이크 %s
                볼 %s %s
                """, strikeCount, ballCounts, nothingCounts);
    }

    public String getResultMessage() {
        return resultMessage;
    }


    public int getStrikeCount() {
        return strikeCount;
    }
}
