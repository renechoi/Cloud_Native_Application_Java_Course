package kosta.basic.day012.inheritanceCasingExample;

public class Main {
    public static void main(String[] args) {
        MyClass math = MySubClass.doMath();
        System.out.println(math.getClass().getSimpleName());
    }
}
