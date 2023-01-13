package kosta.basic.day019.thread.MultithreadExample;

import java.util.stream.IntStream;

public class TransferThread extends Thread{
    SharedArea sharedArea;

    TransferThread(SharedArea area){
        sharedArea = area;
    }

    public void run(){
        IntStream.range(0,12).forEach((v)-> sharedArea.transfer(100));
    }
}
