package kosta.selfMission.abstractAnimals;

public class Sparrow extends Bird{
    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.printf("%s can fly!\n", getName());
    }
}
