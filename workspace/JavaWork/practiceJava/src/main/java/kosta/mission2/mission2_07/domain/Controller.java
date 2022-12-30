package kosta.mission2.mission2_07.domain;

import kosta.mission2.mission2_07.ui.InputView;

public class Controller {

    private InputView inputView;

    public Controller(InputView inputView) {
        this.inputView = inputView;
    }

    public static final int QUIT_COMMAND = 6;

    public void run() {
        Management management = new Management();

        while (true) {
            try {
                Command command = Command.of(inputView.getGeneralCommand());
                if (isQuit(command)) {
                    break;
                }
                command.systemAction(management, inputView);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static boolean isQuit(Command command) {
        return command.getCommand() == QUIT_COMMAND;
    }
}
