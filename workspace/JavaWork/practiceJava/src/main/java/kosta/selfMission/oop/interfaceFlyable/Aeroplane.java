package kosta.selfMission.oop.interfaceFlyable;

public class Aeroplane implements Flyable{
    @Override
    public void fly() {
        System.out.println("with fuel");
    }
}
