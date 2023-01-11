package kosta.basic.day017.sort;

public class Member implements Comparable<Member>{
    private String name;
    private int age;
    private String address;

    public Member(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("name: %s age: %s address: %s", name, age, address);
    }

    @Override
    public int compareTo(Member that) {
        return Integer.compare(that.age, this.age);
    }

}
