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
    private static final String NAME_TO_BE_ALTERED_PREVIOUS = "수정할 기존의 이름을 입력하세요";
    private static final String NAME_TO_BE_ALTERED_NEW = "수정할 새로운 이름을 입력하세요";
    private static final String NAME_TO_BE_REMOVED = "삭제할 이름을 입력하세요";

    public static void main(String[] args) {
        // 메뉴를 선택해서 해당 메뉴의 명령문을 실행해 보자.
        // 1.추가 2.출력 3.검색 4.수정 5.삭제 6.종료

        int number;
        String[] names = new String[5];

        do {
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
        System.out.println(REQUEST_COMMAND);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static String inputViewString(String requestMessage) {
        System.out.println(requestMessage);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static boolean isEndCommand(Integer number) {
        return number != 6;
    }

    public enum Command {

        ADDITION(1) {
            @Override
            public void findMenu(int command, String[] names) {
                System.out.println(MENU_ADDITION);

                int nextInput = getNameIdx(names, null);

                names[nextInput] = String.valueOf(inputViewString(REQUEST_ADDITIONAL_NAME));
            }
        },

        PRINT(2) {
            @Override
            public void findMenu(int command, String[] names) {
                System.out.println(MENU_PRINT);
                Arrays.stream(names).filter(Objects::nonNull).forEach(System.out::println);
            }
        },

        SEARCH(3) {
            @Override
            public void findMenu(int command, String[] names) {
                String requestedName = inputViewString(MENU_SEARCH);
                int nameIdx = getNameIdx(names, requestedName);
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

        ALTER(4) {
            @Override
            public void findMenu(int command, String[] names) {
                names[getNameIdx(names, inputViewString(NAME_TO_BE_ALTERED_PREVIOUS))]
                        = inputViewString(NAME_TO_BE_ALTERED_NEW);
            }
        },

        REMOVE(5) {
            @Override
            public void findMenu(int command, String[] names) {
                String nameToBeRemoved = inputViewString(NAME_TO_BE_REMOVED);
                int idxToBeRemoved = getNameIdx(names, nameToBeRemoved);

                removeName(names, idxToBeRemoved);
            }

            private void removeName(String[] names, int idxToBeRemoved) {
                for (int i = idxToBeRemoved; i < names.length; i++) {
                    names[idxToBeRemoved] = names[idxToBeRemoved + 1];
                }
                names[idxToBeRemoved + 1] = null;
            }
        },

        END(6) {
            @Override
            public void findMenu(int command, String[] names) {
                System.out.println(MENU_END);
            }
        };

        private static int getNameIdx(String[] names, String requestedName) {
            return Arrays.asList(names).indexOf(requestedName);
        }

        private final Integer command;

        Command(int command) {
            this.command = command;
        }

        public abstract void findMenu(int command, String[] names);

    }
}
