package kosta.selfMission.others.optional;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {

    }
}

class Person {
    private Car car;

    public Car getCar(){
        return car;
    }
}


class Car {
    private Insurance insurance;
    public Insurance getInsurance() {
        return insurance;
    }
}

class Insurance {
    private String name;

    public String getName() {
        return name;
    }
}

class PersonWithOptional{
    private Optional<Car> car;

    PersonWithOptional(Optional<Car> car) {
        this.car = car;
    }
}

class CarWithOptional {
    private Optional<Insurance> insurance;

    public Optional<Insurance> getInsurance() {
        return insurance;
    }
}