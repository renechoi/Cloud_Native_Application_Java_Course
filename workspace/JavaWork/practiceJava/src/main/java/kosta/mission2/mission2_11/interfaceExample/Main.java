package kosta.mission2.mission2_11.interfaceExample;

public class Main {
    public static void main(String[] args) {

        Person[] people = {
                new Subscriber("둘리"),
                new Worker("길동"),
                new Student("마이콜")
        };

        for (Person person : people) {
            if (person instanceof Speakable){
                System.out.print(((Speakable) person).speak());

                Speakable speaker = (Speakable) person;
                System.out.print(speaker.speak());
            }
        }

        for (Person person : people) {
            if (person instanceof Speakable speaker){
                System.out.print(speaker.speak());
            }
        }
    }

}
