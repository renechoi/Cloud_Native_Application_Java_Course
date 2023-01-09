package kosta.basic.day015.lamdaEx.work;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();

        person.action(() -> System.out.println("work !!!"));

    }
}
