package kosta.mission2.mission2_11.interfaceExample;

public class Subscriber extends Person implements Speakable {

    public Subscriber(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return String.format("""
                %s 자바 화이팅 !
                """, getName());
    }
}
