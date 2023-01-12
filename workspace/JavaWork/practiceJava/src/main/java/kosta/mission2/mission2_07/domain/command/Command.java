package kosta.mission2.mission2_07.domain.command;

import kosta.mission2.mission2_07.domain.manager.Manager;
import kosta.mission2.mission2_07.domain.Result;

public interface Command{
    Result handleCommand(Manager manager);
}
