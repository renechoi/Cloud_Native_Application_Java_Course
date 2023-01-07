package kosta.toyMission.baseball.ui.outputView;

import kosta.toyMission.baseball.GameController;

public class OutputView {

    public static final String OPENING_MESSAGE =
            """
                    <숫자 야구 게임>
                    게임을 시작합니다!
                               
                    먼저 난이도를 설정할게요.    
                    """;
    public static final String REQUEST_LEVEL_MESSAGE = String.format(
            """
            
            1 ~ 3 사이 숫자 중 하나를 선택해주세요.
            숫자가 높을수록 어렵습니다!
            
            ------------------------- 선택:%s""", " ");
    public static final String LEVEL_SET_INFO_MESSAGE =
            String.format("""
                    
                    컴퓨터가 숫자를 생성했어요!
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
    public static final String SUCCESS_MESSAGE = """
            
            축하합니다! %d번의 시도로 성공하였습니다!
            """;
    public static final String REQUEST_RETRY_MESSAGE = "재시작하려면 0, 종료하려면 1을 입력해주세요: ";

    public static void printStartMessage() {
        System.out.print(OPENING_MESSAGE);
    }

    public static void printRequestLevelMessage() {
        System.out.print(REQUEST_LEVEL_MESSAGE);
    }

    public static void printLevelInfoMessage() {
        System.out.print(LEVEL_SET_INFO_MESSAGE);
    }

    public static void printResultMessage(boolean isNoCount, int strikeCount, int ballCounts) {
        System.out.print(
                isNoCount ? RESULT_AS_NOTHING :
                        String.format(RESULT_WITH_STRIKE_BALL, strikeCount, ballCounts));
    }

    public static void printSuccessMessage(int roundCounts){
        System.out.printf(SUCCESS_MESSAGE, roundCounts);
    }

    public static void printTrialMessage(int roundCounts){
        System.out.printf(TRIAL_COUNT_MESSAGE, roundCounts);
    }

    public static void printRetryMessage(){
        System.out.println(REQUEST_RETRY_MESSAGE);
    }

    public static void printExceptionMessage(String message) {
        System.out.println(message);
    }
}
