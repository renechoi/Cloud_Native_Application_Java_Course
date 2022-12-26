package kosta.basic.day005;

public class MethodExam {
    public static void main(String[] args) {

    }

    private static int add(int num1, int num2){
        return num1 + num2;
    }

    private static void printWord(String string, int number){
        for (int i = 0; i < number; i++){
            System.out.println(string);
        }
        System.out.println();
    }
}
