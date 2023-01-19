package kosta.basic.java.day019.thread.MultithreadExample;

public class MultiMain {
    public static void main(String[] args) {
        SharedArea sharedArea = new SharedArea();

        sharedArea.account1 = new Account("111-111-1111", "이몽룡", 20000L);
        sharedArea.account2 = new Account("222-222-2222", "성춘향", 10000L);

        TransferThread thread1 = new TransferThread(sharedArea);
        PrintThread thread2 = new PrintThread(sharedArea);

        thread1.start();
        thread2.start();
    }
}
