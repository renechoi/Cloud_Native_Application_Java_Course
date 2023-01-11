package kosta.mission2.mission2_07.domain;

import kosta.mission2.mission2_07.domain.command.CommandGeneral;
import kosta.mission2.mission2_07.ui.InputView;

public class Controller {

    public Controller( ) {
    }

    public static final int QUIT_COMMAND = 7;

    public void run() {
        Management management = new Management();

        // TODO : 리팩토링 !
        while (true) {
            try {
                CommandGeneral commandGeneral = CommandGeneral.of(InputView.getGeneralCommand());
                if (isQuit(commandGeneral)) {
                    break;
                }
                commandGeneral.systemAction(management);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static boolean isQuit(CommandGeneral commandGeneral) {
        return commandGeneral.getCommand() == QUIT_COMMAND;
    }
}
