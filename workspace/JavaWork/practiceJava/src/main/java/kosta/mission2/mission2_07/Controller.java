package kosta.mission2.mission2_07;

public class Controller {

    public void run(){
        InputView inputView = new InputView();

        Command command = Command.of(inputView.getCommand());

    }
}
