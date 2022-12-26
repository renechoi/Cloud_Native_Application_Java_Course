package kosta.basic.day005;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExam01 {
    public static void main(String[] args) {

    }

    private static void practiceArrayProblem1() {
        // TODO : 키보드로부터 문자열을 입력받아 배열에 추가한 후 전체를 출력해보자.
        // "q"를 입력할 때까지 입력 받기
        // 입력 : 홍길동
        // 입력 : 박길동
        // 입력 : q
        // 출력 : 홍길동, 박길동

        String[] names = new String[2];

        Scanner scanner = new Scanner(System.in);

        for (int i =0; i<2; i++){
            String name = scanner.nextLine();
            if ("q".equals(name)){
                break;
            }
            names[i] = name;
        }

        System.out.println(Arrays.toString(names));
    }

    private static void practiceStringArray() {
        String[] strArr = new String[5];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = String.valueOf(i);
        }

        System.out.println(strArr);
        System.out.println(Arrays.toString(strArr));


        String[] lastNames = {"kim", "park", "lee"};
        for (String lastName : lastNames) {
            System.out.println(lastName);
        }
    }

    private static void outOfBoundsException() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[5]);
    }

    private static void arrayWithForLoop() {
        int[] arr = {10, 20, 30, 40, 50};

        for (int j : arr) {
            System.out.println(j);
        }
    }

    private static void createArrayDirectly() {
        int[] arr = {1, 2, 3, 4, 5};
    }

    private static void initializeArray() {
        int arr[] = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
    }

    private static void arrayBasic() {
        //1 배열 선언
        int[] arr;

        //2 배열 생성
        arr = new int[5];

        // 동시에
        int[] arr2 = new int[5];
    }
}
