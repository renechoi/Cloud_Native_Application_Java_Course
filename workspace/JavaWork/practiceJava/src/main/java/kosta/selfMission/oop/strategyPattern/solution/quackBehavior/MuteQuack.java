package kosta.selfMission.oop.strategyPattern.solution.quackBehavior;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<조용>");
    }
}
