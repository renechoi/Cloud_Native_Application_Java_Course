package kosta.selfMission.oop.strategyPattern.solution.quackBehavior;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("꽥꽥!");
    }
}
