package kosta.mission2.mission2_07.domain.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class CommandReader {

    private List<Command> commands = new ArrayList<>();

    public CommandReader(Command... commands) {
        this.commands = Arrays.asList(commands);
    }

//    public Command parseCommand(int userInput) {
//        for (Command commandEach : commands) {
//            validate(commandEach, userInput);
//            Command command = commandEach.of(userInput);
//            return command;
//        }
//    }

//    private void validate(Command command, int userInput) {
//        Arrays.stream(command.values())
//                .filter(c -> c.getCommand() == userInput)
//                .findAny()
//                .orElseThrow(() -> new InvalidCommandException(InvalidCommandException.INVALID_COMMAND));
//    }
//
//    public Command getCommand() {
//        return command;
//    }
}
