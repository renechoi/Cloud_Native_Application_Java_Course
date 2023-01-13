package kosta.basic.day019.thread.MultithreadExample;

public class PrintThread extends Thread{
    SharedArea sharedArea;

    PrintThread(SharedArea area){
        sharedArea = area;
    }

    public void run(){
        for (int i=0;i<3;i++){
            long sum = sharedArea.getTotal();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
