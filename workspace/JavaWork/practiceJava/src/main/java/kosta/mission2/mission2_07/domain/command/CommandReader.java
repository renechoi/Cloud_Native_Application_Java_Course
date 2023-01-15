package kosta.mission2.mission2_07.domain.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface  CommandReader {

    public abstract Command parseCommand(int userInput);

    public abstract void validate(int userInput);


}
