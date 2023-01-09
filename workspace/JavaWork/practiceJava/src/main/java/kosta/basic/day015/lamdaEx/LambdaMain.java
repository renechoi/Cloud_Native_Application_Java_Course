package kosta.basic.day015.lamdaEx;

public class LambdaMain {
    public static void main(String[] args) {
        // 1단계 myType => 익명 내부 클래스로 구현해보자
        // 2단계 lambda
        // 3단계 한 줄 lambda

        MyType myType = new MyType() {
            @Override
            public void hello() {
                System.out.println("this is anonymous class!");
            }
        };


        MyType myType2 = () -> {
            System.out.println("this is lambda expression!");
        };

        myType.hello();
        myType2.hello();

        MyType myType3 = () -> System.out.println("this is lambda expression2!");

    }
}
