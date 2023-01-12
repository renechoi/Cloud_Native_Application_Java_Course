package kosta.mission2.mission2_07.domain;

import kosta.mission2.mission2_07.domain.command.Command;
import kosta.mission2.mission2_07.domain.command.SystemCommand;
import kosta.mission2.mission2_07.domain.command.CommandReader;
import kosta.mission2.mission2_07.ui.InputView;

public class Controller {

    public Controller() {
    }

    public static final int QUIT_COMMAND = 7;

    public void run() {
        Management management = new Management();
        CommandReader commandReader = new CommandReader();

        // TODO : 리팩토링 !
        while (true) {
            try {
                Command command = commandReader.parseCommand(InputView.getGeneralCommand());

                SystemCommand systemCommand = SystemCommand.of(InputView.getGeneralCommand());
                if (isQuit(systemCommand)) {
                    break;
                }
                systemCommand.handleCommand(management);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static boolean isQuit(SystemCommand systemCommand) {
        return systemCommand.getCommand() == QUIT_COMMAND;
    }

}
