package kosta.selfMission.abstractAnimals2;

public abstract class Bird extends Animal implements Flyable {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.printf("%s can eat!\n", getName());
    }

    @Override
    public void breath() {
        System.out.printf("%s can breathe!\n", getName());
    }

    @Override
    public void fly() {
        System.out.printf("%s can fly!\n", getName());
    }

}
