package kosta.mission2.mission2_06.solution2;

import java.util.Arrays;
import java.util.Scanner;

public class AccountMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account[] arr = new Account[10];

        int count = 0;
        while (true) {

            if (count >= 10) {
                break;
            }

            System.out.println("1, 2, 3, 4, 5");
            System.out.println("메뉴 입력 ");

            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    System.out.println("지정할 이름을 입력해주세요");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    Account account = new Account(name);
                    arr[count] = account;
                    System.out.println(Arrays.toString(arr));
                    count++;
                    break;
                case 2:
                    System.out.println(Arrays.toString(arr));
                    break;
                case 3:
                    int idx = 0;

                    break;
                case 4:
                    System.out.println("입금할 계좌를 선택해주세요");
                    int idxToBeDeposited = scanner.nextInt() +1 ;
                    System.out.println("입금할 금액을 입력해주세요");
                    int amountToBeDeposited = scanner.nextInt();

                    Account accountToBeDeposited = arr[idxToBeDeposited];
                    accountToBeDeposited.amount = amountToBeDeposited;
                    break;

                case 5:
                    System.out.println("출금할 계좌를 선택해주세요");
                    int idxToBeWithdraw = scanner.nextInt() + 1;
                    System.out.println("출금할 금액을 입력해주세요");
                    int amountToBeWithdraw = scanner.nextInt();

                    Account accountToBeWithdraw = arr[idxToBeWithdraw];
                    accountToBeWithdraw.amount -= amountToBeWithdraw;
                    break;
            }


        }
    }
}
