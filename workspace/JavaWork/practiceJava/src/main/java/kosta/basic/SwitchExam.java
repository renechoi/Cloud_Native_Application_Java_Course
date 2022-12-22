package kosta.basic;

import java.util.Scanner;

public class SwitchExam {
    public static void main(String[] args) {
        // 1. 햄버거 2. 피자 3. 콜람 4. 기타

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("햄버거");
                break;
            case 2:
                System.out.println("피자");
                break;
            case 3:
                System.out.println("콜라");
                break;
            case 4:
                System.out.println("기타");
                break;
        }


    }
}
