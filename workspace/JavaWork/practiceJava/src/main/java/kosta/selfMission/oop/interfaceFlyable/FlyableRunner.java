package kosta.selfMission.oop.interfaceFlyable;

public class FlyableRunner {
    public static void main(String[] args) {
        Flyable[] flyingObjects = { new Bird(), new Aeroplane()};

        for (Flyable flyingObject : flyingObjects){
            flyingObject.fly();
        }
    }
}
