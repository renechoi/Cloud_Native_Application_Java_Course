package kosta.toyMission.baseball;

import kosta.toyMission.baseball.controller.GameController;
import kosta.toyMission.baseball.ui.outputView.OutputView;

public class Application {
    public static void main(String[] args) {
        try {
            GameController controller = new GameController();
            controller.run();
        } catch (RuntimeException e){
            OutputView.printUnhandledExceptionMessage("예기치 못한 오류가 발생했어요. 프로그램을 종료합니다.");
        }
    }
}
