package kosta.mission2.mission2_07.domain.command;

import kosta.mission2.mission2_07.domain.Controller;
import kosta.mission2.mission2_07.domain.Management;

import java.util.Arrays;

public enum SystemCommand implements Command{

    ADD_INFO(1) {
        @Override
        public void handleCommand(Management management) {
            management.addInfo();
        }
    },
    PRINT_INFO_ALL(2) {
        @Override
        public void handleCommand(Management management) {
            management.printInfoAll();
        }
    },
    PRINT_INFO_BY_NAME(3) {
        @Override
        public void handleCommand(Management management) {
            management.printInfoByName();
        }
    },
    UPDATE(4) {
        @Override
        public void handleCommand(Management management) {
            management.update();
        }
    },
    DELETE(5) {
        @Override
        public void handleCommand(Management management) {
            management.delete();
        }
    },
    SORT(6) {
        @Override
        public void handleCommand(Management management) {
            management.handleSortRequest(management);
        }
    },
    EXIT(Controller.QUIT_COMMAND) {
        @Override
        public void handleCommand(Management management) {
        }
    };

    private final int command;

    SystemCommand(int userChoice) {
        this.command = userChoice;
    }

    public static SystemCommand of(int userChoice) {
        return Arrays.stream(values())
                .filter(v -> v.command == userChoice)
                .findFirst()
                .orElseThrow(() -> new InvalidCommandException(InvalidCommandException.INVALID_COMMAND));
    }

    public int getCommand() {
        return command;
    }
}