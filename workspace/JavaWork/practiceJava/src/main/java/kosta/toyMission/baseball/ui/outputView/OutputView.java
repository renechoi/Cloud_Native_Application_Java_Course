package kosta.toyMission.baseball.ui.outputView;

import kosta.toyMission.baseball.GameController;

public class OutputView {

    public static final String OPENING_MESSAGE =
            """
                    <숫자 야구 게임>
                    게임을 시작합니다!
                                        
                    """;
    public static final String LEVEL_INFO_MESSAGE =
            String.format("""
                    컴퓨터가 숫자를 생성했습니다!
                    숫자는 총 %d개 입니다.
                    생성된 숫자와 동일한 개수의 숫자를 입력해서 맞추어야 합니다.
                    이제 머리를 굴리세요!
                                        
                    """, GameController.BASEBALL_SIZE);
    public static final String RESULT_AS_NOTHING =
            """
                                    
                    낫싱! 노 스트라이크, 노 볼... 잘 좀 하세요!
                    ^--------------^
                                    
                    """;
    public static final String RESULT_WITH_STRIKE_BALL =
            """
                                            
                    %s 스트라이크
                    %s 볼
                                            
                    """;
    public static final String TRIAL_COUNT_MESSAGE = "%d 회 시도했습니다\n";

    public static void printStartMessage() {
        System.out.print(OPENING_MESSAGE);
    }

    public static void printLevelMessage() {
        System.out.print(LEVEL_INFO_MESSAGE);
    }

    public static void printResultMessage(boolean isNoCount, int strikeCount, int ballCounts) {
        System.out.print(
                isNoCount ? RESULT_AS_NOTHING :
                        String.format(RESULT_WITH_STRIKE_BALL, strikeCount, ballCounts));
    }

    public static void printTrialMessage(int roundCounts){
        System.out.printf(TRIAL_COUNT_MESSAGE, roundCounts);
    }

    public static void printExceptionMessage(String message) {
        System.out.print(message);
    }
}
