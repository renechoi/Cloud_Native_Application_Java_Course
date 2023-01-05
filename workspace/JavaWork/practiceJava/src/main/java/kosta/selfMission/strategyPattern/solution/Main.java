package kosta.selfMission.strategyPattern.solution;

import kosta.selfMission.strategyPattern.solution.flyBehavior.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
    }
}
