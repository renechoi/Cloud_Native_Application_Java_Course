package kosta.selfMission.abstractAnimals3;

import kosta.selfMission.abstractAnimals3.bird.Penguin;
import kosta.selfMission.abstractAnimals3.bird.Sparrow;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("요크셔");
        dog.breath();

        Sparrow sparrow = new Sparrow("참새");
        sparrow.performFly();

        Penguin penguin = new Penguin("펭귄");
        penguin.performFly();
    }
}
