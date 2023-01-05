package kosta.selfMission.oop.abstractAnimals2;

public class Dog extends Animal {

    public Dog(String name) {
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
}
