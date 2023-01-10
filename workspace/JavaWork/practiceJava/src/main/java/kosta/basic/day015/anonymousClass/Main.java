package kosta.basic.day015.anonymousClass;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Study study = new Study();

        Role drive = new Role() {
            @Override
            public void doSomething() {
                System.out.println("drive !");
            }
        };

        Person person = new Person("홍", drive);

        Person person2 = new Person("김", new Role() {
            @Override
            public void doSomething() {
                System.out.println("coding !!!");
            }
        });




    }

}
