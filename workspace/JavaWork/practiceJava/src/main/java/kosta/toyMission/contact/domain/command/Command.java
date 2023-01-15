package kosta.toyMission.contact.domain.command;

import kosta.toyMission.contact.domain.Result;
import kosta.toyMission.contact.domain.manager.Manager;

public interface Command{
//    Result handleCommand(Manager manager);

    Result handleCommand(Manager manager);

}
