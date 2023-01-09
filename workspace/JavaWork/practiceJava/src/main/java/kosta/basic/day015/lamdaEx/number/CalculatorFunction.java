package kosta.basic.day015.lamdaEx.number;

@FunctionalInterface
public interface CalculatorFunction<T extends Number> {
    <T> T calculate(T x, T y);
}
