package kosta.basic.day015.lamdaEx.number;

public class Calculator<T extends Number>{

    private CalculatorFunction calculatorFunction;

    public Calculator(CalculatorFunction calculatorFunction) {
        this.calculatorFunction = calculatorFunction;
    }

    public T calculateMax(T x, T y){
        this.calculatorFunction = new CalculatorFunction() {
            @Override
            public Long calculate(Object x, Object y) {
                return Math.max((Long) x, (Long) y);

            }
        };

        return (T) calculatorFunction.calculate(x,y);
    }





}
