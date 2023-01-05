package kosta.selfMission.oop.abstractAnimals2;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("요크셔");
        dog.breath();

        Sparrow sparrow = new Sparrow("참새");
        sparrow.fly();

        Penguin penguin = new Penguin("펭귄");
        penguin.fly();
    }
}
