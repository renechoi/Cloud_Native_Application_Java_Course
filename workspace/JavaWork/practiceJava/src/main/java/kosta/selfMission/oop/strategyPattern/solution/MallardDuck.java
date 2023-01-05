package kosta.selfMission.oop.strategyPattern.solution;

import kosta.selfMission.oop.strategyPattern.solution.flyBehavior.FlyWithWings;
import kosta.selfMission.oop.strategyPattern.solution.quackBehavior.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리입니다!");
    }
}
