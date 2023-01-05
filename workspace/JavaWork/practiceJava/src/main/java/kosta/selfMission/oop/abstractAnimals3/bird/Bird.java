package kosta.selfMission.oop.abstractAnimals3.bird;

import kosta.selfMission.oop.abstractAnimals3.Animal;
import kosta.selfMission.oop.abstractAnimals3.flyBehavior.FlyBehavior;

public abstract class Bird extends Animal {

    FlyBehavior flyBehavior;

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

    public void performFly(){
        flyBehavior.fly();
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
