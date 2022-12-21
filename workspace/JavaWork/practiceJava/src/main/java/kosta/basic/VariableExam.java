package kosta.basic;

public class VariableExam {
    public static void main(String[] args) {
        // 변수 선언 : 데이터형 변수형

        // 데이터형 : 기본형(primitive) / 참조형 (reference)
        int number; // 변수선언 : int -> 4byte 메모리 할당
        number = 10; // 초기화 : initialize

        String string = "홍길동";

        // 원래는 이렇게 해야 함
//        String string2 = new String("홍길동");

        System.out.println("나의이름은" + string + "입니다");

        byte byte1 = 4;
        short short1 = 8;
        int number2 = 16;
        long number3 = 22000000000L;

        float float1;
        float1 = 3.1f;
        double double1;
        double1 = 3.141592;

        char character = 'a';

        boolean boolean1 = true;


    }
}
