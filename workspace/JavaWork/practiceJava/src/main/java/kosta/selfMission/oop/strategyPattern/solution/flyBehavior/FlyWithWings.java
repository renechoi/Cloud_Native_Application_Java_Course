package kosta.selfMission.oop.strategyPattern.solution.flyBehavior;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("can fly!");
    }
}
