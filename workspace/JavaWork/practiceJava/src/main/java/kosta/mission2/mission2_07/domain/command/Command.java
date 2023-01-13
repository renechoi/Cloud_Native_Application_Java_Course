package kosta.mission2.mission2_07.domain.command;

import kosta.mission2.mission2_07.domain.Result;
import kosta.mission2.mission2_07.domain.manager.Manager;

public interface Command{
//    Result handleCommand(Manager manager);

    Result handleCommand(Manager manager);

}
