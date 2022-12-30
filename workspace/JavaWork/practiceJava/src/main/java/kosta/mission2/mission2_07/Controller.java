package kosta.mission2.mission2_07;

public class Controller {

    public static final int QUIT_COMMAND = 3;

    public void run() {
        Management management = new Management();
        while (true) {
            Command command = Command.of(new InputView().getGeneralCommand());
            if (isQuit(command)) {
                break;
            }
            command.systemAction(management);
        }
    }

    private static boolean isQuit(Command command) {
        return command.getCommand() == QUIT_COMMAND;
    }
}
