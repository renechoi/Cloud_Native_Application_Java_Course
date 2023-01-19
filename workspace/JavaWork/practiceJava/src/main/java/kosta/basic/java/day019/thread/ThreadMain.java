package kosta.basic.java.day019.thread;

public class ThreadMain {
    public static void main(String[] args) {
      Thread thread1 = new DigitThread();
      thread1.start();

      SmallLetters smallLetters = new SmallLetters();
      Thread thread2 = new Thread(smallLetters);
      thread2.start();

    }

}
