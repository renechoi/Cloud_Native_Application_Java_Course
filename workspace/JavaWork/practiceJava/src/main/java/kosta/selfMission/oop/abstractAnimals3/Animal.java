package kosta.selfMission.oop.abstractAnimals3;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();

    public abstract void breath();

    public String getName() {
        return String.format("%s %s", getClass().getSimpleName(), name);
    }
}
