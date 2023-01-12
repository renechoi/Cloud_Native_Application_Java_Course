package kosta.mission2.mission2_07.domain.command;

import kosta.mission2.mission2_07.domain.Controller;
import kosta.mission2.mission2_07.domain.Management;
import kosta.mission2.mission2_07.domain.Result;

import java.util.Arrays;

public enum SystemCommand implements Command {

    ADD_INFO(1) {
        @Override
        public Result handleCommand(Management management) {
            return management.addInfo();
        }
    },
    PRINT_INFO_ALL(2) {
        @Override
        public Result handleCommand(Management management) {
            return management.printInfoAll();
        }
    },
    PRINT_INFO_BY_NAME(3) {
        @Override
        public Result handleCommand(Management management) {
            return management.printInfoByName();
        }
    },
    UPDATE(4) {
        @Override
        public Result handleCommand(Management management) {
            return management.update();
        }
    },
    DELETE(5) {
        @Override
        public Result handleCommand(Management management) {
            return management.delete();
        }
    },
    SORT(6) {
        @Override
        public Result handleCommand(Management management) {
            return management.handleSortRequest(management);
        }
    },
    SAVE_FILE(7) {
        @Override
        public Result handleCommand(Management management) {
            return management.saveFile();
        }
    },
    LOAD_FILE(8) {
        @Override
        public Result handleCommand(Management management) {
            return management.loadFile();
        }
    },
    EXIT(Controller.QUIT_COMMAND) {
        @Override
        public Result handleCommand(Management management) {
            return management.quit();
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