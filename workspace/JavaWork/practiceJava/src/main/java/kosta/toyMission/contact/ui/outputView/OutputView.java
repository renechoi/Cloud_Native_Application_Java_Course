package kosta.toyMission.contact.ui.outputView;

public class OutputView {

    private enum ConsoleMessage {
        CONTACT_EMPTY_MESSAGE("연락처가 텅텅 비어있어요! 어서 추가를 해주세요 :)"),
        RUNTIME_EXCEPTION_MESSAGE("예기치 못한 오류 발생했어요. 어플리케이션을 종료합니다!"),
        QUIT_COMMAND_CONFIRM_MESSAGE("종료 명령을 확인했어요. 어플리케이션을 종료합니다!");

        private final String message;

        ConsoleMessage(String message) {
            this.message = message;
        }
    }

    public static void printContactEmptyMessage() {
        System.out.print(ConsoleMessage.CONTACT_EMPTY_MESSAGE.message);
    }

    public static void printRunTimeExceptionMessage() {
        System.out.print(ConsoleMessage.RUNTIME_EXCEPTION_MESSAGE.message);
    }

    public static void printQuitCommandConfirmMessage() {
        System.out.print(ConsoleMessage.QUIT_COMMAND_CONFIRM_MESSAGE.message);
    }

    public static void printExceptionMessage(String message){
        System.out.print(message);
    }

}
