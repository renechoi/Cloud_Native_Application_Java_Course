package kosta.mission2.mission2_07.mission2_07_2.domain.command;

import kosta.mission2.mission2_07.mission2_07_2.domain.manager.Manager;
import kosta.mission2.mission2_07.mission2_07_2.domain.Result;

import java.util.Arrays;

public enum SortCommand implements Command{

    SORT_BY_TYPE(1) {
        @Override
        public Result handleCommand(Manager manager) {
            return manager.sortByType();
        }
    },
    SORT_BY_NAME(2) {
        @Override
        public Result handleCommand(Manager manager) {
            return manager.sortByName();
        }

    },
    SORT_BY_NUMBER(3) {
        @Override
        public Result handleCommand(Manager manager) {
            return manager.sortByNumber();
        }
    },
    SORT_BY_DOB(4) {
        @Override
        public Result handleCommand(Manager manager) {
            return manager.sortByDob();
        }
    };

    private final int command;

    SortCommand(int userChoice) {
        this.command = userChoice;
    }

    public static SortCommand of(int userChoice) {
        return Arrays.stream(values())
                .filter(sortCommands -> sortCommands.command == userChoice)
                .findFirst()
                .orElseThrow(() -> new InvalidCommandException(InvalidCommandException.INVALID_COMMAND));
    }

    public int getCommand() {
        return command;
    }

    public abstract Result handleCommand(Manager manager);
}