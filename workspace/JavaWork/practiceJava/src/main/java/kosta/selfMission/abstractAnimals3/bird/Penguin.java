package kosta.selfMission.abstractAnimals3.bird;

import kosta.selfMission.abstractAnimals3.bird.Bird;
import kosta.selfMission.abstractAnimals3.flyBehavior.FlyNoWay;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
        this.flyBehavior = new FlyNoWay();
    }


}
