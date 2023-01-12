package kosta.mission2.mission2_07.domain.command;

import kosta.mission2.mission2_07.domain.Management;

public interface Command{
    void handleCommand(Management management);
}
