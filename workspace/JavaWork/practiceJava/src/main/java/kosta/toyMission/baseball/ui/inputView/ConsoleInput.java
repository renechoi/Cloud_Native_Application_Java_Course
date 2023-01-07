package kosta.toyMission.baseball.ui.inputView;

import java.util.Scanner;

abstract class ConsoleInput {
    static final Scanner scanner = new Scanner(System.in);
    abstract String getInput();
}
