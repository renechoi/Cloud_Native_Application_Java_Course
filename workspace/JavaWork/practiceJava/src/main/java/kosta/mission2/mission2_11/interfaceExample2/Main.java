package kosta.mission2.mission2_11.interfaceExample2;

public class Main {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);

        thread.start();
    }
}
