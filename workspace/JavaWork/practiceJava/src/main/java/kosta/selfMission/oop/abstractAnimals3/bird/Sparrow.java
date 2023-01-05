package kosta.selfMission.oop.abstractAnimals3.bird;

import kosta.selfMission.oop.abstractAnimals3.flyBehavior.FlyHigh;

public class Sparrow extends Bird {
    public Sparrow(String name) {
        super(name);
        this.flyBehavior = new FlyHigh();
    }
}
