package kosta.mission.Mission05;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Mission05_01 {

    private static final String REQUEST_COMMAND = "숫자를 입력하세요.";
    private static final String MENU_ADDITION = "추가 메뉴를 선택했습니다.\n";
    private static final String MENU_PRINT = "출력 메뉴를 선택했습니다.\n";
    private static final String MENU_SEARCH = "검색 메뉴를 선택했습니다.\n";
    private static final String MENU_END = "종료 메뉴를 선택했습니다.\n";
    private static final String REQUEST_ADDITIONAL_NAME = "추가할 이름을 입력하세요.";
    private static final String NAME_NOT_IN_THE_MENU = "%s은 저장되어 있지 않습니다!\n";
    private static final String NAME_IN_THE_MENU_WITH_INDEX = "%s은 %d에 메뉴에 저장되어 있습니다.\n";

    public static void main(String[] args) {
        // 메뉴를 선택해서 해당 메뉴의 명령문을 실행해 보자.
        // 1.추가 2.출력 3.검색 4.종료

        int number;
        String[] names = new String[5];

        do {

            System.out.println(REQUEST_COMMAND);
            number = inputViewNumber();
            executeCommand(number, names);
        } while (isEndCommand(number));
    }

    private static void executeCommand(int number, String[] names) {

        Command command = Arrays.stream(Command.values())
                .filter(v -> v.command.equals(number))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);

        command.findMenu(number, names);
    }

    private static Integer inputViewNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static String inputViewString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static boolean isEndCommand(Integer number) {
        return number != 4;
    }

    public enum Command {

        ADDITION(1) {
            @Override
            public void findMenu(int command, String[] names) {
                System.out.println(MENU_ADDITION);

                int nextInput = Arrays.asList(names).indexOf(null);

                System.out.println(REQUEST_ADDITIONAL_NAME);
                names[nextInput] = String.valueOf(inputViewString());
            }
        },

        PRINT(2) {
            @Override
            public void findMenu(int command, String[] names) {
                System.out.println(MENU_PRINT);
                Arrays.stream(names).filter(Objects::nonNull).forEach(System.out::println);
//                System.out.println(Arrays.toString(names));
            }
        },

        SEARCH(3) {
            @Override
            public void findMenu(int command, String[] names) {
                System.out.println(MENU_SEARCH);
                String requestedName = inputViewString();
                int nameIdx = Arrays.asList(names).indexOf(requestedName);
                if (!isContains(names, requestedName)) {
                    System.out.printf(NAME_NOT_IN_THE_MENU, requestedName);
                    return;
                }
                System.out.printf(NAME_IN_THE_MENU_WITH_INDEX, requestedName, nameIdx + 1);

            }

            private boolean isContains(String[] names, String requestedName) {
                //                Arrays.stream(names).anyMatch(requestedName::equals);
                return Arrays.asList(names).contains(requestedName);
            }
        },

        END(4) {
            @Override
            public void findMenu(int command, String[] names) {
                System.out.println(MENU_END);
            }
        };

        private final Integer command;

        Command(int command) {
            this.command = command;
        }

        public abstract void findMenu(int command, String[] names);

    }
}

