package kosta.mission2.mission2_07.domain.command;

import kosta.mission2.mission2_07.domain.manager.Manager;
import kosta.mission2.mission2_07.domain.Result;

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
        validate(userChoice);
        this.command = userChoice;
    }

    public static SortCommand of(int userChoice) {
        return Arrays.stream(values())
                .filter(v -> v.command == userChoice)
                .findFirst()
                .orElseThrow(() -> new InvalidCommandException(InvalidCommandException.INVALID_COMMAND));
    }

    private void validate(int userChoice) {
        if (userChoice != 1 && userChoice != 2 && userChoice != 3 && userChoice != 4 ) {
            throw new InvalidCommandException(InvalidCommandException.INVALID_COMMAND);
        }
    }

    public abstract Result handleCommand(Manager manager);
}