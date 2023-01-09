package kosta.basic.day015.api.object;

import java.util.Objects;

public class Person2 {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object person) {
        if (person == this) {
            return true;
        }

        Person2 person2 = (Person2) person;
        return name.equals(person2.getName()) && age == person2.getAge();
    }

    @Override
    public int hashCode() {
        // hashCode 재정의
//        return Objects.hash(0);
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
