package kosta.basic.java.day014.oop2.abstractEx2;

public class Student extends Person{
    public Student(String name) {
        super(name);
    }

    public Student() {
    }

    @Override
    void doSomething() {
        System.out.println("do study");
    }
}
