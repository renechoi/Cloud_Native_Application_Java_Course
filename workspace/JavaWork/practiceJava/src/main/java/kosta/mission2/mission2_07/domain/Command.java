package kosta.mission2.mission2_07.domain;

import kosta.mission2.mission2_07.ui.InputView;

import java.util.Arrays;

enum Command {

    ADD_INFO(1) {
        @Override
        public void systemAction(Management management, InputView inputView) {
            management.addInfo(inputView);
        }
    },
    PRINT_INFO_ALL(2) {
        @Override
        public void systemAction(Management management, InputView inputView) {
            management.printInfoAll();
        }

    },
    PRINT_INFO_BY_NAME(3) {
        @Override
        public void systemAction(Management management, InputView inputView) {
            management.printInfoByName(inputView);
        }
    },
    UPDATE(4) {
        @Override
        public void systemAction(Management management, InputView inputView) {
            management.update(inputView);
        }
    },
    DELETE(5) {
        @Override
        public void systemAction(Management management, InputView inputView) {
            management.delete(inputView);
        }
    },
    EXIT(6) {
        @Override
        public void systemAction(Management management, InputView inputView) {
        }
    };

    private final int command;

    Command(int userChoice) {
        validate(userChoice);
        this.command = userChoice;
    }

    public static Command of(int userChoice) {
        return Arrays.stream(values())
                .filter(v -> v.command == userChoice)
                .findFirst()
                .orElseThrow(() -> new InvalidCommandException(InvalidCommandException.INVALID_COMMAND));
    }

    public int getCommand() {
        return command;
    }

    private void validate(int userChoice) {
        if (userChoice != 1 && userChoice != 2 && userChoice != 3 && userChoice != 4 && userChoice != 5 && userChoice != 6) {
            throw new InvalidCommandException(InvalidCommandException.INVALID_COMMAND);
        }
    }

    public abstract void systemAction(Management management, InputView inputView);
}