package kosta.basic.java.day012.inheritanceCasingExample;

public class MyClass {

    protected String name;

    public MyClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static MyClass getNewMyClass() {
        return new MyClass("kim");
    }

    public void sayHi() {
        System.out.println("Hi.");
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                '}';
    }
}