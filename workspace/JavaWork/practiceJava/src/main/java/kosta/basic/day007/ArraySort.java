package kosta.basic.day007;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {
    public static void main(String[] args) {
        sort2DimensionalArray();
    }

    private static void sort2DimensionalArray() {
        //2차원 배열을 정렬하는 방법
        int[][] arr2 = {
                {2, 90},
                {1, 60},
                {3, 20}
        };

        System.out.println(Arrays.deepToString(arr2));

        // 배열은 단순한 sort 함수로 정렬되지는 않는다!
        Arrays.sort(arr2, new Comparator<int[]>() {
                    @Override
                    public int compare(int[] o1, int[] o2) {
                        // 정렬 기준 작성 : 2차원 배열 안에 있는 1차원 첫 번째 인덱스를 기준으로 오름차순
                        return o1[0] - o2[0];   //
                    }
                }
        );

        System.out.println(Arrays.deepToString(arr2));

        Arrays.sort(arr2, Comparator.comparingInt(o -> o[0]));

        System.out.println(Arrays.deepToString(arr2));


        int[][] arr3 = {
                {2, 90},
                {5, 30},
                {3, 80}
        };
        Arrays.sort(arr3, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        // Arrays.sort(arr3, (o1, o2) -> o2[1] - o1[1]);
        System.out.println(Arrays.deepToString(arr3));
    }

    private static void bubbleSort() {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
            }
        }

//        for (int i = arr.length - 1; i > 0; i--) {
//            int temp = arr[i - 1];
//            arr[i - 1] = arr[i];
//            arr[i] = temp;
//        }
//
//        for (int i = arr.length - 1; i > 1; i--) {
//            int temp = arr[i - 1];
//            arr[i - 1] = arr[i];
//            arr[i] = temp;
//        }
//
//        for (int i = arr.length - 1; i > 2; i--) {
//            int temp = arr[i - 1];
//            arr[i - 1] = arr[i];
//            arr[i] = temp;
//        }
//
//        for (int i = arr.length - 1; i > 3; i--) {
//            int temp = arr[i - 1];
//            arr[i - 1] = arr[i];
//            arr[i] = temp;
//        }


        System.out.println(Arrays.toString(arr));
    }

    private static void moveLastElementToFirst() {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[i - 1];
            System.out.println(i);
            arr[i - 1] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void practiceSortMethod() {
        // 배열 내용을 정렬하기
        int[] arr = {3, 2, 5};
        System.out.println(Arrays.toString(arr));

        // 오름차순 정렬하기
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        // for문을 이용해 내림차순으로 바꿔보자
        // 새로운 arr를 사용해서 하는 방법
        int[] arr2 = new int[arr.length];
        int count = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            System.out.println();
            arr2[count] = arr[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
