package kosta.mission2.mission2_06.solution1;

import java.util.Scanner;

public class InputView {

    public static final String REQUEST_COMMAND = "명령을 입력하세요 : 1.메뉴 생성 2.전체 조회 3.계좌 조회 4.입금 5.출금";
    public static final String REQUEST_ACCOUNT_NAME = "계좌명을 입력하세요: ";
    int input;

    InputView(){
    }

    public int getCommand(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(REQUEST_COMMAND);
        return Integer.parseInt(scanner.nextLine());
    }

    public String getAccountName(){
        System.out.println(REQUEST_ACCOUNT_NAME);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


}
