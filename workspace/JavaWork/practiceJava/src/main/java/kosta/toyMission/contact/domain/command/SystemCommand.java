package kosta.toyMission.contact.domain.command;

import kosta.toyMission.contact.domain.Controller;
import kosta.toyMission.contact.domain.Result;
import kosta.toyMission.contact.domain.manager.Manager;

import java.util.Arrays;

public enum SystemCommand implements Command {

    ADD_INFO(1) {
        @Override
        public Result handleCommand(Manager manager) {
            return manager.addInfo();
        }
    },
    PRINT_INFO_ALL(2) {
        @Override
        public Result handleCommand(Manager manager) {
            return manager.printInfoAll();
        }
    },
    PRINT_INFO_BY_NAME(3) {
        @Override
        public Result handleCommand(Manager manager) {
            return manager.printInfoByName();
        }
    },
    UPDATE(4) {
        @Override
        public Result handleCommand(Manager manager) {
            return manager.update();
        }
    },
    DELETE(5) {
        @Override
        public Result handleCommand(Manager manager) {
            return manager.delete();
        }
    },
    SORT(6) {
        @Override
        public Result handleCommand(Manager manager) {
            return manager.handleSortRequest(manager);
        }
    },
    SAVE_FILE(7) {
        @Override
        public Result handleCommand(Manager manager) {
            return manager.saveFile();
        }
    },
    LOAD_FILE(8) {
        @Override
        public Result handleCommand(Manager manager) {
            return manager.loadFile();
        }
    },
    EXIT(Controller.QUIT_COMMAND) {
        @Override
        public Result handleCommand(Manager manager) {
            return manager.quit();
        }
    };

    private final int command;

    SystemCommand(int userChoice) {
        this.command = userChoice;
    }

    public static SystemCommand of(int userChoice) {
        return Arrays.stream(values())
                .filter(systemCommands -> systemCommands.command == userChoice)
                .findFirst()
                .orElseThrow(() -> new InvalidCommandException(InvalidCommandException.INVALID_COMMAND));
    }

    public int getCommand() {
        return command;
    }

    public abstract Result handleCommand(Manager manager);
}