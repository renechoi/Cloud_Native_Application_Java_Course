package kosta.toyMission.baseball.ui.outputView;

import kosta.toyMission.baseball.GameController;

import java.util.List;

public class OutputView {

    public static final String OPENING_MESSAGE =
            """
                    <숫자 야구 게임>
                    게임을 시작합니다!
                               
                    먼저 난이도를 설정할게요.
                    """;
    public static final String REQUEST_LEVEL_MESSAGE =
            """
                                
                    1 ~ 3 사이 숫자 중 하나를 선택해주세요.
                    숫자가 높을수록 어렵습니다!
                                
                    ------------------------- 선택: """;
    public static final String LEVEL_SET_INFO_MESSAGE =
            """
                                        
                    컴퓨터가 숫자를 생성했어요!
                    숫자는 총 %d개 입니다.
                    생성된 숫자와 동일한 개수의 숫자를 입력해서 맞추어야 합니다.
                    이제 머리를 굴리세요!
                    """;
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
    public static final String TRIAL_COUNT_MESSAGE = "%d 회 시도했습니다";
    public static final String SUCCESS_MESSAGE = """
                        
            축하합니다! %d번의 시도로 성공했어요 '-'
            """;
    public static final String REQUEST_RETRY_MESSAGE = "재시작하려면 0, 종료하려면 1을 입력해주세요: ";
    public static final String HINT_INFO_MESSAGE_1 = """
            
            벌써 %d번째 시도군요! 힌트를 좀 드려야 할 거 같아요 :)
            #을 입력하면 힌트를 볼 수 있답니다!
            """;
    public static final String CHEAT_KEY_INFO_MESSAGE_1 = """
            
            저런... 1번만 더 하면 %d번째 시도에요...!
            치트키를 알려드릴까요?
            ##을 입력해보세요 '◡'*
            
            """;
    public static final String HINT_INFO_MESSAGE_2 = """
            
            힌트를 드릴게요.
            방금 입력한 숫자보다
            첫번째는 %s, 두번째는 %s, 세번째는 %s
            입니다!
            """;
    public static final String CHEAT_KEY_INFO_MESSAGE_2 = """
            
            치트키로 첫 번째 숫자를 알려드릴게요.
            %s 입니다!
            ^ㅡㅡㅡㅡㅡ^
            
            """;



    public static void printStartMessage() {
        System.out.print(OPENING_MESSAGE);
    }

    public static void printRequestLevelMessage() {
        System.out.print(REQUEST_LEVEL_MESSAGE);
        System.out.println();
    }

    public static void printLevelInfoMessage() {
        System.out.printf(LEVEL_SET_INFO_MESSAGE, GameController.BASEBALL_SIZE);
    }

    public static void printResultMessage(boolean isNoCount, int strikeCount, int ballCounts) {
        System.out.print(
                isNoCount ? RESULT_AS_NOTHING :
                        String.format(RESULT_WITH_STRIKE_BALL, strikeCount, ballCounts));
    }

    public static void printSuccessMessage(int roundCounts) {
        System.out.printf(SUCCESS_MESSAGE, roundCounts);
    }

    public static void printTrialMessage(int roundCounts) {
        System.out.printf(TRIAL_COUNT_MESSAGE, roundCounts);
    }

    public static void printHintMessage1(int roundCounts) {
        System.out.printf(HINT_INFO_MESSAGE_1, roundCounts);
    }

    public static void printCheatKeyMessage1(int roundCounts) {
        System.out.printf(CHEAT_KEY_INFO_MESSAGE_1, roundCounts);
    }

    public static void printHintMessage2(List<String> hints) {
        System.out.printf(HINT_INFO_MESSAGE_2, hints.get(0), hints.get(1),hints.get(2));
    }

    public static void printCheatKeyMessage2(int cheatKey) {
        System.out.printf(CHEAT_KEY_INFO_MESSAGE_2, cheatKey);
    }

    public static void printRetryMessage() {
        System.out.print(REQUEST_RETRY_MESSAGE);
        System.out.println();
    }

    public static void printExceptionMessage(String message) {
        System.out.println(message);
    }
}
