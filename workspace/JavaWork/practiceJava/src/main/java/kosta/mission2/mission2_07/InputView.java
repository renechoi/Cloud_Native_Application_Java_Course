package kosta.mission2.mission2_07;

import java.util.Scanner;

public class InputView {

    Scanner scanner;

    private enum ConsoleMessage {
        REQUEST_GENERAL_COMMAND("명령을 입력하세요(1.추가 2.전체 조회 3.검색 4.종료): "),
        REQUEST_NAME("이름을 입력하세요: "),
        REQUEST_NUMBER("전화번호를 입력하세요: "),
        REQUEST_DOB_YEAR("생년월일을 차례로 입력하세요(년)"),
        REQUEST_DOB_MONTH("생년월일을 차례로 입력하세요(월)"),
        REQUEST_DOB_DATE("생년월일을 차례로 입력하세요(일)");

        private final String message;

        ConsoleMessage(String message) {
            this.message = message;
        }
    }

    InputView() {
        scanner = new Scanner(System.in);
    }

    public int getGeneralCommand() {
        System.out.print(ConsoleMessage.REQUEST_GENERAL_COMMAND.message);
        return Integer.parseInt(scanner.nextLine());
    }

    public String getName() {
        System.out.print(ConsoleMessage.REQUEST_NAME.message);
        return scanner.nextLine();
    }

    public String getNumber() {
        System.out.print(ConsoleMessage.REQUEST_NUMBER.message);
        return scanner.nextLine();
    }

    public int getDobYear() {
        System.out.print(ConsoleMessage.REQUEST_DOB_YEAR.message);
        return Integer.parseInt(scanner.nextLine());
    }

    public int getDobMonth() {
        System.out.print(ConsoleMessage.REQUEST_DOB_MONTH.message);
        return Integer.parseInt(scanner.nextLine());
    }

    public int getDobDate() {
        System.out.print(ConsoleMessage.REQUEST_DOB_DATE.message);
        return Integer.parseInt(scanner.nextLine());
    }

}