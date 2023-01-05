package kosta.selfMission.abstractAnimals2;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.printf("%s oops I can't fly!\n", getName());
    }
}
