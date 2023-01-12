package kosta.mission2.mission2_07.domain.command;

public class CommandReader {
    private Command command;

    public CommandReader() {
    }

    public Command parseCommand(int userInput){
        validate(userInput);
        this.command = SystemCommand.of(userInput);
        return command;
    }

    // TODO : 리팩토링 가즈아 !!!!!
    private void validate(int userInput) {
        if (userInput != 1 && userInput != 2 && userInput != 3 && userInput != 4 && userInput != 5 && userInput != 6 && userInput != 7 && userInput != 8 && userInput != 9) {
            throw new InvalidCommandException(InvalidCommandException.INVALID_COMMAND);
        }
    }

    public Command getCommand() {
        return command;
    }
}
