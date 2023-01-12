package kosta.mission2.mission2_07.domain.command;

import java.util.Arrays;

public class SortCommandReader {
    private Command command;

    public SortCommandReader() {
    }

    public Command parseCommand(int userInput){
        validate(userInput);
        this.command = SortCommand.of(userInput);
        return command;
    }

    private void validate(int userInput) {
        Arrays.stream(SortCommand.values())
                .filter(command->command.getCommand() == userInput)
                .findAny()
                .orElseThrow(()->new InvalidCommandException(InvalidCommandException.INVALID_COMMAND));
    }

    public Command getCommand() {
        return command;
    }
}
