package kosta.selfMission.abstractAnimals3.flyBehavior;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I cannot fly!");
    }
}
