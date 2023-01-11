package kosta.mission2.mission2_07.domain;

import kosta.mission2.mission2_07.ui.InputView;

import java.util.Arrays;

enum Command {

    ADD_INFO(1) {
        @Override
        public void systemAction(Management management) {
            management.addInfo();
        }
    },
    PRINT_INFO_ALL(2) {
        @Override
        public void systemAction(Management management) {
            management.printInfoAll();
        }

    },
    PRINT_INFO_BY_NAME(3) {
        @Override
        public void systemAction(Management management) {
            management.printInfoByName();
        }
    },
    UPDATE(4) {
        @Override
        public void systemAction(Management management) {
            management.update();
        }
    },
    DELETE(5) {
        @Override
        public void systemAction(Management management) {
            management.delete();
        }
    },
    SORT(6) {
        @Override
        public void systemAction(Management management) {
            management.delete();
        }
    },
    EXIT(Controller.QUIT_COMMAND) {
        @Override
        public void systemAction(Management management) {
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
        if (userChoice != 1 && userChoice != 2 && userChoice != 3 && userChoice != 4 && userChoice != 5 && userChoice != 6 && userChoice != 7) {
            throw new InvalidCommandException(InvalidCommandException.INVALID_COMMAND);
        }
    }

    public abstract void systemAction(Management management);
}