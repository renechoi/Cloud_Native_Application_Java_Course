package kosta.mission2.mission2_07.domain.command;

import kosta.mission2.mission2_07.domain.Management;

import java.util.Arrays;

public enum CommandSort {

    SORT_BY_TYPE(1) {
        @Override
        public void sortAction(Management management) {
            management.sortByType();
        }
    },
    SORT_BY_NAME(2) {
        @Override
        public void sortAction(Management management) {
            management.sortByName();
        }

    },
    SORT_BY_NUMBER(3) {
        @Override
        public void sortAction(Management management) {
            management.sortByNumber();
        }
    },
    SORT_BY_DOB(4) {
        @Override
        public void sortAction(Management management) {
            management.sortByDob();
        }
    };

    private final int command;

    CommandSort(int userChoice) {
        validate(userChoice);
        this.command = userChoice;
    }

    public static CommandSort of(int userChoice) {
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

    public abstract void sortAction(Management management);
}