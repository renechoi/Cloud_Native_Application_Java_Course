package kosta.basic.day015.lamdaEx.type;


public class Main {
    public static void main(String[] args) {
        YourType you = System.out::println;

        you.talk("hi!");


        Person person = new Person(you);

    }
}
