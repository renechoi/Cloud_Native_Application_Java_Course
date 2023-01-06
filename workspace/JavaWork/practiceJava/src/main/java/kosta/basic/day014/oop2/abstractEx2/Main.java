package kosta.basic.day014.oop2.abstractEx2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.doSomething();

        Student person = new Student("홍길동");
        person.doSomething();
    }
}
