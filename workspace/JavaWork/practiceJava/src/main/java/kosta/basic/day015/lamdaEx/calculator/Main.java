package kosta.basic.day015.lamdaEx.calculator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculator<Integer> add = n -> (n == null) ? 0 : Arrays.stream(n).reduce(0, Integer::sum);

        int sum = add.calculate(1,2,3,4,5,6);
        System.out.println(sum);

        Calculator<Integer> getMax = n -> (n==null)? 0 : Arrays.stream(n).reduce(0,Integer::max);

    }
}
