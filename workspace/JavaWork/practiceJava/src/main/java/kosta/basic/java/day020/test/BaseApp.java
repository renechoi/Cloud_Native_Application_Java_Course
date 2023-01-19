package kosta.basic.java.day020.test;

public class BaseApp {
    public static void main(String[] args) {
        Base base = new MyBase();
        base.service("낮");
        base.service("밤");
        base.service("오후");
    }
}
