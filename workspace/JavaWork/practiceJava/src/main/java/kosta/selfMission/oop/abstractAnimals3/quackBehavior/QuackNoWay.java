package kosta.selfMission.oop.abstractAnimals3.quackBehavior;

public class QuackNoWay implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<조용>");
    }
}
