package kosta.basic.day005;

import java.util.Arrays;

public class CallByExam {
    public static void main(String[] args) {
        // CallByValue vs. CallByReference

        int number = 10;
        testChange(number);
        System.out.println(number);

        int[] arr= {1,2,3};
        int[] brr= arr;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));

        testChange2(brr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));

        testString();
    }

    private static void testString(){
        String str1 = "hello";
        String str2 = "hello";

        String str3 = new String("hello");
        String str4 = new String("hello");

        System.out.println(str1==str2);         // 원래는 같지 않지만 true가 나오는 이유 : jvm이 같은 값을 가지는 주소를 훑고 같은 주소를 가졌을 경우 같은 주소를 참조한다.
        System.out.println(str3==str4);
        System.out.println();
    }


    private static void testChange2(int arr[]){
        arr[0] = 100;
    }

    private static void testChange(int number){
        number +=10;
    }

}
