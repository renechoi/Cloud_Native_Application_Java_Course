package kosta.basic.day006;

public class ArrayExam02 {
    public static void main(String[] args) {



    }

    private static void nineTimesTable() {
        // 2치원 배열 문제를 만들어서 사용해보자

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
    }

    private static void twoDimensionalArrayWithForLoop() {
        // 2차원 배열 선언, 생성, 초기화
        int arr3[][] = {{1, 2}, {3, 4}, {5, 6}}; //== [3][2]

        // 2차원 배열은 2중 for문을 이용해 각각 출력할 수 있다.

        for (int i = 0; i < 3; i++) {       // arr3.length
            for (int j = 0; j < 2; j++) {   // arr[0].length
                System.out.printf("arr[%d][%d] = %d\n", i, j, arr3[i][j]);
            }
        }
    }

    private static void createTwoDimensionalArray() {
        // 2차원 배열의 크기를 다르게 생성하는 방법
        int arr2[][] = new int[3][];
        arr2[0] = new int[2];
        arr2[1] = new int[3];
        arr2[2] = new int[4];
    }

    private static void twoDimensionalArrayBasic() {
        // 2차원 배열은 각 1차원 배열마다 2차원의 배열 크기를 생성
        int arr[][];
        arr = new int[3][2];
    }
}
