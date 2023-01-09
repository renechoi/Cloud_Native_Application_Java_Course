package kosta.basic.day015.api.object;

public class PersonMain {
    public static void main(String[] args) {


        Person person1 = new Person("l", 20);
        System.out.println(person1);

        Person2 person2 = new Person2("k", 20);
        Person2 person3 = new Person2("k", 20);
        System.out.println(person2);

        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());


    }

    private static void equalsModifiedExample() {
        Person2 person1 = new Person2("kim", 20);
        Person2 person2 = new Person2("kim", 20);

        Runnable identification = person1.equals(person2) ?
                () -> System.out.println("equals true!") :
                () -> System.out.println("equals false!");

        identification.run();
    }

    private static void equalExample1() {
        Person person1 = new Person("kim", 20);
        Person person2 = new Person("kim", 20);

        if (person1.equals(person2)) {
            System.out.println("equals true!");
        } else {
            System.out.println("equals not true!");
        }

        Runnable identification = person1.equals(person2) ?
                () -> System.out.println("equals true!") :
                () -> System.out.println("equals not true!");

        identification.run();
    }


}
