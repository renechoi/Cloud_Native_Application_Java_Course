package kosta.selfMission.oop.interfaceGamingConsole;

public class ChessGame implements InterfaceGamingConsole {
    @Override
    public void up() {
        System.out.println("move up!");
    }

    @Override
    public void down() {
        System.out.println("move down!");
    }

    @Override
    public void left() {
        System.out.println("move left!");
    }

    @Override
    public void right() {
        System.out.println("move right!");
    }
}
