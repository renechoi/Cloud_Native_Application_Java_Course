package kosta.selfMission.strategyPattern.solution;

import kosta.selfMission.strategyPattern.solution.flyBehavior.FlyWithWings;
import kosta.selfMission.strategyPattern.solution.quackBehavior.Quack;

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
