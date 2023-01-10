package kosta.selfMission.others.functionalProgramming;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {



    public static void main(String[] args) {
        List.of(23, 43, 34, 45)
                .stream()
                .filter(n -> n%2 ==0)
                .forEach(e-> System.out.println(e));

        // filter :    Stream<T> filter(Predicate<? super T> predicate);

        //@FunctionalInterface
        //public interface Predicate<T> {
        //
        //    /**
        //     * Evaluates this predicate on the given argument.
        //     *
        //     * @param t the input argument
        //     * @return {@code true} if the input argument matches the predicate,
        //     * otherwise {@code false}
        //     */
        //    boolean test(T t);



        List.of(23, 43, 34, 45)
                .stream()
                .filter(new EvenNumberPredicate())
                .forEach(e-> System.out.println(e));
    }
}


class EvenNumberPredicate implements Predicate<Integer>{

    @Override
    public boolean test(Integer number) {
        return number % 2 ==0;
    }
}