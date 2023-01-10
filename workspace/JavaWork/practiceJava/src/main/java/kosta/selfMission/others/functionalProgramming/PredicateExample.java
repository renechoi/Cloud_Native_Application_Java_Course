package kosta.selfMission.others.functionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateExample {


    public static void main(String[] args) {

        List.of(23, 43, 34, 45, 36, 48)
                .stream()
                .filter(new EvenNumberPredicate())
                .map(new NumberSquareMapper())
                .forEach(new SystemOutConsumer());


        //    <R> Stream<R> map(Function<? super T, ? extends R> mapper);

        // map -> Function 인터페이스 => 인자를 받아서 다른 값으로 리턴한다

//        @FunctionalInterface
//        public interface Function<T, R> {
//
//            /**
//             * Applies this function to the given argument.
//             *
//             * @param t the function argument
//             * @return the function result
//             */
//            R apply(T t);
//


    }

    private static void practiceConsumer() {
        List.of(23, 43, 34, 45, 36, 48)
                .stream()
                .filter(new EvenNumberPredicate())
                .forEach(new SystemOutConsumer());

        // foreach => consumer 인터페이스를 구혀
//        @FunctionalInterface
//        public interface Consumer<T> {
//
//            /**
//             * Performs this operation on the given argument.
//             *
//             * @param t the input argument
//             */
//            void accept(T t);
    }

    private static void predicateCustom() {
        List.of(23, 43, 34, 45)
                .stream()
                .filter(new EvenNumberPredicate())
                .forEach(e -> System.out.println(e));
    }

    private static void predicateOriginal() {
        List.of(23, 43, 34, 45)
                .stream()
                .filter(n -> n % 2 == 0)
                .forEach(e -> System.out.println(e));

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
    }
}


class EvenNumberPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer number) {
        return number % 2 == 0;
    }
}

class SystemOutConsumer implements Consumer<Integer> {

    @Override
    public void accept(Integer number) {
        System.out.println(number);
    }
}

class NumberSquareMapper implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer number) {
        return number * number;
    }
}