package kosta.selfMission.oop.strategyPattern.solution.quackBehavior;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("꽉!");
    }
}
