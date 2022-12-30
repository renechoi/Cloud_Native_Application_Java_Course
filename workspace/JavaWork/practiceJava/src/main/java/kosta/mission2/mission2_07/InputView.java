package kosta.mission2.mission2_07;

import java.util.Scanner;

public class InputView {

    public static final String REQUEST_GENERAL_COMMAND = "명령을 입력하세요(추가 2.출력 3.종료): ";
    int input;

    InputView(){
    }

    public int getCommand(){
        Scanner scanner = new Scanner(System.in);
        System.out.print(REQUEST_GENERAL_COMMAND);
        return Integer.parseInt(scanner.nextLine());
    }

}