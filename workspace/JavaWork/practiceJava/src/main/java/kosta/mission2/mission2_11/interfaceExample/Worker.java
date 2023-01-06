package kosta.mission2.mission2_11.interfaceExample;

public class Worker extends Person implements Speakable{

    public Worker(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return String.format("""
                %s 일 열심히 하자!
                """, getName());
    }
}
