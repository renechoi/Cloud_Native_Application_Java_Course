package kosta.mission3.mission3_03;

public class Member {
    private String name;
    private int age;
    private String address;

    public Member(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("""
                name : %s
                age : %s
                address : %s
                """, name, age, address);
    }
}
