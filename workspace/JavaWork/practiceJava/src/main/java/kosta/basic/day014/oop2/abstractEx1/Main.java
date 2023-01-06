package kosta.basic.day014.oop2.abstractEx1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("홍길동", new Study());
        person1.doSomething();

        Person person2 = new Person("홍길동", new Study());
        person2.doSomething();
    }
}
