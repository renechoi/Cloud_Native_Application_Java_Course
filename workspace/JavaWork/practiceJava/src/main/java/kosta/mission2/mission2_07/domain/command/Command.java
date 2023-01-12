package kosta.mission2.mission2_07.domain.command;

import kosta.mission2.mission2_07.domain.Management;
import kosta.mission2.mission2_07.domain.Result;

public interface Command{
    Result handleCommand(Management management);
}
