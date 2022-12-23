package kosta.mission.mission06;

import java.util.Scanner;

public class InputNumber {
    private static final Scanner scanner = new Scanner(System.in);
    private int inputNumber;
    private static final String NUMBER_RANGE_EXCEPTION = "number should be between 1 ~ 100";

    public InputNumber() {
        this.inputNumber = enterNumber();
        validate(inputNumber);
    }

    public static int enterNumber(){
        System.out.println("숫자를 입력하세요:");
        return scanner.nextInt();
    }

    private void validate(int number) {
        if (number<1 || number >100) {
            throw new IllegalArgumentException(NUMBER_RANGE_EXCEPTION);
        }
    }

    public int getInputNumber() {
        return inputNumber;
    }
}
