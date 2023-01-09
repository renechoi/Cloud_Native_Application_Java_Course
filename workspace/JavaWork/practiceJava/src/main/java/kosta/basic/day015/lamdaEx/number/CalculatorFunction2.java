package kosta.basic.day015.lamdaEx.number;

public interface CalculatorFunction2<T extends Number> {
    <T> T calculate(T x, T y);
}
