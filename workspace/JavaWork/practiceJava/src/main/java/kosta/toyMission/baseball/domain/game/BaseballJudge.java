package kosta.toyMission.baseball.domain.game;

import kosta.toyMission.baseball.domain.computer.Baseball;

import java.util.stream.IntStream;

public class BaseballJudge {
    private int strikeCount;
    private int ballCounts;
    private String resultMessage;
    private boolean isSuccess;

    public BaseballJudge(Baseball computers, Baseball players) {
        this.strikeCount = countStrike(computers, players);
        this.ballCounts = countBalls(computers, players);
        this.resultMessage = formatMessage();
    }

    private boolean isNothing() {
        return this.ballCounts == 0 && this.strikeCount == 0;

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


    private String formatMessage() {
        return (isNothing() ?
                """
                
                낫싱! 잘 좀 하세요!
                ^--------------^
                
                """ :
                String.format("""
                        
                        %s 스트라이크
                        %s 볼
                        
                        """, strikeCount, ballCounts));
    }

    public String getResultMessage() {
        return resultMessage;
    }


    public int getStrikeCount() {
        return strikeCount;
    }
}
