package kosta.mission2.mission2_07.domain.command;

import java.util.Arrays;

// TODO : Reader 중복 해결하는 방법을 고민해보자!
// 생성자에 주입시켜주면 커맨드리더를 하나로 통일해서 사용할 수 있다

public class SystemCommandReader implements CommandReader {
    private Command command;

    public SystemCommandReader() {
    }

    public Command parseCommand(int userInput){
        validate(userInput);
        this.command = SystemCommand.of(userInput);
        return command;
    }

    public void validate(int userInput) {
        Arrays.stream(SystemCommand.values())
                .filter(command->command.getCommand() == userInput)
                .findAny()
                .orElseThrow(()->new InvalidCommandException(InvalidCommandException.INVALID_COMMAND));
    }

    public Command getCommand() {
        return command;
    }
}
