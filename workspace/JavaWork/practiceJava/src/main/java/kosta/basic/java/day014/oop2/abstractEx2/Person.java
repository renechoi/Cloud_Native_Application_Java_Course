package kosta.basic.java.day014.oop2.abstractEx2;

public abstract class Person extends Role{
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    abstract void doSomething();
}
