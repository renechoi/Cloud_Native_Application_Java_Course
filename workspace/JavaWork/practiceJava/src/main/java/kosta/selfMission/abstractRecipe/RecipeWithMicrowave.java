package kosta.selfMission.abstractRecipe;

public class RecipeWithMicrowave extends AbstractRecipe{
    @Override
    void getReady() {
        System.out.println("microwave");
    }

    @Override
    void doTheDish() {
        System.out.println("dish with microwave");
    }

    @Override
    void cleanUp() {
        System.out.println("cleanup with microwave");
    }
}
