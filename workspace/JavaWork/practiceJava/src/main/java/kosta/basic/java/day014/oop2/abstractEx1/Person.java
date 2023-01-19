package kosta.basic.java.day014.oop2.abstractEx1;

public class Person {
    private String name;
    private Role role;

    public Person() {
    }

    public Person(String name, Role work) {
        this.name = name;
        this.role = work;
    }

    public void doSomething(){
        role.doSomething();
    }
}
