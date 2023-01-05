package kosta.selfMission.oop.abstractRecipe;

public class Recipe1 extends AbstractRecipe{
    @Override
    void getReady() {
        System.out.println("Get the raw materials");
    }

    @Override
    void doTheDish() {
        System.out.println("Prepare the dishes!");
    }

    @Override
    void cleanUp() {
        System.out.println("Clean!");
    }
}
