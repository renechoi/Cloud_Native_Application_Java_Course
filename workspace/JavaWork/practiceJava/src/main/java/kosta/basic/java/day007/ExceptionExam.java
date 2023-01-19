package kosta.basic.java.day007;

public class ExceptionExam {
    public static void main(String[] args) {



    }

    private static void handleThrownMethod() {
        try{
            practiceThrowMethod();
        } catch (Exception e){
            e.printStackTrace();    // 예외 발생한 자취를 추적해준다.
        }
    }

    private static void practiceThrowMethod() throws Exception {
        int a = 10;
        int b = 10;

        if (a==b){
         throw new Exception("같으면 안돼");
        }
    }

    private static void practiceFinallyStatement() {
        int a = 10;
        int b = 0;

        try {
            int divided = a / b;
            System.out.println(divided);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("4");
        }
    }

    private static void exceptionEx1() {
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }
}
