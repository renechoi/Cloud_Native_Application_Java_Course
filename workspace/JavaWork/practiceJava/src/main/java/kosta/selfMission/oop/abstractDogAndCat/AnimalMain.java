package kosta.selfMission.oop.abstractDogAndCat;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animals = { new Cat(), new Dog()};

        for (Animal animal : animals){
            animal.bark();
        }

        // 같은 메서드를 호출하면서 다른 방식을 구현한다 ! => 다형성
        // same code, different behavior
    }
}
