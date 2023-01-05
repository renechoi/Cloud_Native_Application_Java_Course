package kosta.selfMission.oop.abstractAnimals;

public abstract class Bird extends Animal{

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

    public abstract void fly();


}
