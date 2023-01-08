package kosta.toyMission.baseball.domain.game;

import kosta.toyMission.baseball.GameController;
import kosta.toyMission.baseball.ui.outputView.OutputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Helper {
    hint("#"){
        private List<String> hints;
        @Override
        public void provideHelp(List<Integer> computers, List<Integer> players) {
            hints = new ArrayList<>();

            for (int i = 0; i < GameController.BASEBALL_SIZE; i++) {
                String hint = computers.get(i) > players.get(i) ? "up" :
                        (computers.get(i) < players.get(i) ? "down" : "equal");
                hints.add(hint);
            }
            OutputView.printHintMessage2(hints);
        }
    },
    cheatKey("##"){
        private String cheatKey;
        @Override
        public void provideHelp(List<Integer> computers, List<Integer> players) {
            OutputView.printCheatKeyMessage2(computers.get(0));
        }
    };

    private final String helpCommand;

    Helper(String helpCommand) {
        this.helpCommand = helpCommand;
    }

    public static Helper parseHelp(String playersHelpCommand){
        return Arrays.stream(values())
                .filter(v->v.helpCommand.equals(playersHelpCommand))
                .findFirst()
                .orElseThrow(RuntimeException::new);
    }

    public abstract void provideHelp(List<Integer> computers, List<Integer> players);
}
