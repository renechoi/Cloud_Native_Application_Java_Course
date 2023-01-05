package kosta.selfMission.oop.strategyPattern.solution;

import kosta.selfMission.oop.strategyPattern.solution.quackBehavior.QuackBehavior;
import kosta.selfMission.oop.strategyPattern.solution.flyBehavior.FlyBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("Duck is swimming!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
