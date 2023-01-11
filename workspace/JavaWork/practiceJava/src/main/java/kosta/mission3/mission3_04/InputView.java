package kosta.mission3.mission3_04;

import java.util.Scanner;

public class InputView {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String requestOrder() {
        System.out.print(String.format("""
        메뉴를 고르세요: %s""", " "));
        return SCANNER.nextLine().trim();
    }

    public static String requestConfirm(){
        System.out.println("\n주문 확인 부탁드릴게요! 맞다면 1번 눌러주세요오오오 :)");
        return SCANNER.nextLine().trim();
    }
}
