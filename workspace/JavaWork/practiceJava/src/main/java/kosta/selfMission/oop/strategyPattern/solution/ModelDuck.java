package kosta.selfMission.oop.strategyPattern.solution;

import kosta.selfMission.oop.strategyPattern.solution.flyBehavior.FlyNoWay;
import kosta.selfMission.oop.strategyPattern.solution.quackBehavior.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다 !");
    }
}
