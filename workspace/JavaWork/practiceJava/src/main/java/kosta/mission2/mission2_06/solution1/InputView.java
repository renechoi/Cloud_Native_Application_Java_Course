package kosta.mission2.mission2_06.solution1;

import java.util.Scanner;

public class InputView {

    int input;

    InputView(){
    }

    public int getInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
