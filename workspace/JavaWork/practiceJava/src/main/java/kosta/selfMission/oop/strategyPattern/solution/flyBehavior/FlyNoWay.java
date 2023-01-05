package kosta.selfMission.oop.strategyPattern.solution.flyBehavior;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("can't fly!");
    }
}
