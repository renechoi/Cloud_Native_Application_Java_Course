package kosta.mission2.mission2_11.interfaceExample2;

public class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i< 10; i++){
            try{
                Thread.sleep(1000);
            } catch (Exception e){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();

        for (int i = 11; i<=20; i++){
            try {
                Thread.sleep(1000);
            } catch (Exception e){
                System.out.println(i);
            }
        }
    }
}
