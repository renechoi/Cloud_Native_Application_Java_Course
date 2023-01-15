package kosta.toyMission.contact.domain.command;

public interface  CommandReader {

    public abstract Command parseCommand(int userInput);

    public abstract void validate(int userInput);


}
