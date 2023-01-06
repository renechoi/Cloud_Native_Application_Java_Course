package kosta.mission2.mission2_11.interfaceExample;

public class Student extends Person {

    public Student(String name) {
        super(name);
    }

    public String speak() {
        return String.format("""
                %s 공부나 열심히 해랏 !
                """, getName());
    }
}
