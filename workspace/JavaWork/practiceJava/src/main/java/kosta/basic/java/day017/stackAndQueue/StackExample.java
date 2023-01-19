package kosta.basic.java.day017.stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // 키보드로부터 수학 수식을 입력
        // ((2+3)+10) => 괄호 일치 여부 판단

        Scanner scanner = new Scanner(System.in);

        while (true) {
            Stack<Character> stack = new Stack<>();
            System.out.print("수식 입력: ");
            String word = scanner.nextLine();
            try {
                for (int i = 0; i < word.length(); i++) {
                    char alphabet = word.charAt(i);

                    if (alphabet == '(') {
                        stack.push(alphabet);
                        continue;
                    }
                    if (alphabet == ')') {

                        stack.pop();

                    }

                    if (stack.isEmpty()) {
                        System.out.println("수식 일치 !");
                        continue;
                    }

                    System.out.println("수식 일치 안함 !");
                }

            } catch (Exception ignored) {
                System.out.println("수식 일치 안함 !");
            }
        }
    }
}