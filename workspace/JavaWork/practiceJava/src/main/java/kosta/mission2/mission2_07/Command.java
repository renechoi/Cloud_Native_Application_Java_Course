package kosta.mission2.mission2_07;

import java.util.Arrays;

enum Command {

    ADD_INFO(1) {
        @Override
        public void systemAction() {
        }
    },
    PRINT_INFO(2) {
        @Override
        public void systemAction() {
        }

    },
    EXIT(3) {
        @Override
        public void systemAction() {
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
    public abstract void systemAction();
}