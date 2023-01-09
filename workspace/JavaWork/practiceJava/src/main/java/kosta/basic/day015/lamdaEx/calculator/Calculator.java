package kosta.basic.day015.lamdaEx.calculator;

public interface Calculator<T> {
    T calculate(T ...n);
}
