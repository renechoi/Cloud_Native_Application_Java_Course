package kosta.selfMission.strategyPattern.solution.quackBehavior;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<조용>");
    }
}
