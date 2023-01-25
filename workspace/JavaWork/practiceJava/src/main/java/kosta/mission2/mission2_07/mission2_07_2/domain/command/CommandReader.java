package kosta.mission2.mission2_07.mission2_07_2.domain.command;

public interface  CommandReader {

    public abstract Command parseCommand(int userInput);

    public abstract void validate(int userInput);


}
