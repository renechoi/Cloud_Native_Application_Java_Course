package kosta.mission;

import java.util.Arrays;
import java.util.Scanner;

public class Mission05 {
    public static void main(String[] args) {
        // 메뉴를 선택해서 해당 메뉴의 명령문을 실행해 보자.
        // 1.추가 2.출력 3.검색 4.종료

        int number;
        do {
            number = inputView();
            executeCommand(number);
        } while (isEndCommand(number));
    }

    private static void executeCommand(int number) {

        Command command = Arrays.stream(Command.values())
                .filter(v -> v.command.equals(number))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);

        System.out.println(command.findMenu(number));

//
//        if (number == 1) {
//            System.out.println("추가");
//        }
//        if (number == 2) {
//            System.out.println("출력");
//        }
//        if (number == 3) {
//            System.out.println("검색");
//        }
//        if (number == 4) {
//            System.out.println("종료");
//        }
    }

    private static Integer inputView() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static boolean isEndCommand(Integer number) {
        return number != 4;
    }

    public enum Command {

        ADDITION(1) {
            @Override
            public String findMenu(int command) {
                return "추가 선택";
            }
        },
        PRINT(2) {
            @Override
            public String findMenu(int command) {
                return "출력 선택";
            }
        },
        SEARCH(3) {
            @Override
            public String findMenu(int command) {
                return "검색 선택";
            }
        },
        END(4) {
            @Override
            public String findMenu(int command) {
                return "프로그램 종료";
            }
        };

        private final Integer command;

        Command(int command) {
            this.command = command;
        }

        public abstract String findMenu(int command);

    }
}


