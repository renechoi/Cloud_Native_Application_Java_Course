package kosta.mission2.mission2_07.domain;

import kosta.mission2.mission2_07.domain.command.Command;
import kosta.mission2.mission2_07.domain.command.CommandReader;
import kosta.mission2.mission2_07.domain.manager.Manager;
import kosta.mission2.mission2_07.ui.InputView;

public class Controller {

    public Controller() {
    }

    public static final int QUIT_COMMAND = 9;

    public void run() {
        Manager manager = new Manager();
        CommandReader commandReader = new CommandReader();
        processCRUD(manager, commandReader);
    }

    private void processCRUD(Manager manager, CommandReader commandReader) {

        /*
         * 반복 작동 구현을 위해 do-while 구문이 아닌 재귀적 호출을 사용하였다.
         * while 혹은 do-while 문 사용시
         * 1. 코드 블럭이 늘어나고
         * 2. flag 기능 수행을 위한 필드 선언 혹은 지역변수 생성이 필요하다
         * 재귀적 호출 방식은 이와 같은 단점을 해결하면서도 효율적인 로직을 구현할 수 있도록 하는 장점이 있다고 판단하였다.
         */
        try {
            Command command = commandReader.parseCommand(InputView.getGeneralCommand());
            Result result = command.handleCommand(manager);

            if (!result.isQuit()) {
                processCRUD(manager, commandReader);
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            processCRUD(manager, commandReader);
        }
    }
}
