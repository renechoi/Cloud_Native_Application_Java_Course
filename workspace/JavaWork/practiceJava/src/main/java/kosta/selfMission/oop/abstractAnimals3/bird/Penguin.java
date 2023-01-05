package kosta.selfMission.oop.abstractAnimals3.bird;

import kosta.selfMission.oop.abstractAnimals3.flyBehavior.FlyNoWay;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
        this.flyBehavior = new FlyNoWay();
    }


}
