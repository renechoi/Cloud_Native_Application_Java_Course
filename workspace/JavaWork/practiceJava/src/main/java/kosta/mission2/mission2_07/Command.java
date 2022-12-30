package kosta.mission2.mission2_07;

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
        }
    },
    EXIT(3) {
        @Override
        public void systemAction(Management management) {
        }
    };

    private final int command;

    Command(int userChoice) {
        this.command = userChoice;
    }

    public static Command of(int userChoice) {
        return Arrays.stream(values())
                .filter(v -> v.command == userChoice)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    public int getCommand() {
        return command;
    }

    public abstract void systemAction(Management management);
}