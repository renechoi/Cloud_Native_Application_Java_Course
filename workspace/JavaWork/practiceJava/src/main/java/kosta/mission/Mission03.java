package kosta.mission;

import java.util.Scanner;

public class Mission03 {
    public static void main(String[] args) {
        // TODO : 임의의 정수값에 대해 전체 자리수 중 짝수, 홀수의 개수를 구해보자
        // 5자리수 ex)12345
        // 짝수 -> 3개
        // 홀수 -> 2개

        solution1();

        solution2();
    }

    private static void solution2() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int even = 0;
        int odd = 0;

        even += (number / 10000) % 2 == 0 ? 1 : 0;
        even += (number / 1000 % 10) % 2 == 0 ? 1 : 0;
        even += (number / 100 % 10) % 2 == 0 ? 1 : 0;
        even += (number / 10 % 10) % 2 == 0 ? 1 : 0;
        even += (number) % 2 == 0 ? 1 : 0;

        odd = 5 - even;

        System.out.printf("짝수 : %d개 \n", even);
        System.out.printf("홀수 : %d개", odd);
    }

    private static void solution1() {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        int evenCounts = 0;
        int oddCounts = 0;

        for (int i = 0; i < number.length(); i++) {
            if (isEven((int) number.charAt(i))) {
                evenCounts++;
                continue;
            }
            oddCounts++;
        }
        System.out.printf("짝수 : %d개 \n", evenCounts);
        System.out.printf("홀수 : %d개", oddCounts);
    }

    private static boolean isEven(Integer number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

}
