package kosta.selfMission.others.supplier;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

    }

    private static void simpleExample1() {
        Supplier<String> helloSupplier = () -> "Hello ";

        System.out.println(helloSupplier.get() + "World");
    }


}
