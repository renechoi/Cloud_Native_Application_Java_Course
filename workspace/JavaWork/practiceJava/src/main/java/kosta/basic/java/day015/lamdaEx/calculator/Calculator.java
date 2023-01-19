package kosta.basic.java.day015.lamdaEx.calculator;

public interface Calculator<T> {
    T calculate(T ...n);
}
