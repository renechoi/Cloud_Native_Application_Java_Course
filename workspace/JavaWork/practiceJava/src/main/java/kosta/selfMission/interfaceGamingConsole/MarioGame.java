package kosta.selfMission.interfaceGamingConsole;

public class MarioGame implements InterfaceGamingConsole{
    @Override
    public void up() {
        System.out.println("jump!");
    }

    @Override
    public void down() {
        System.out.println("down!");
    }

    @Override
    public void left() {

    }

    @Override
    public void right() {

    }
}
