package kosta.basic.java.day019.thread;

import java.util.stream.IntStream;

public class SmallLetters implements Runnable{
    @Override
    public void run() {
        getTotal();

        for (char ch = 'a'; ch <= 'z'; ch++){
            System.out.println(ch);

        }
    }

    synchronized int getTotal(){
        return IntStream.range(0,101).sum();
    }
}
