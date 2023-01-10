package kosta.selfMission.others.multiThreading;


class Task1 extends Thread {
    @Override
    public void run() {
        System.out.println("task1 start");
        for (int i = 101; i <= 199; i++) {
            System.out.print(i + " ");
        }

        System.out.print("\n task1 done");
    }
}

class Task2 implements Runnable{

    @Override
    public void run() {
        System.out.println("task2 start");
        for (int i = 201; i <= 299; i++) {
            System.out.print(i + " ");
        }

        System.out.print("\n task2 done");

    }
}

public class ThreadMain {
    public static void main(String[] args) {

        // thread를 생성하는 두 가지 방식
        // extends Thread
        // implements Runnable

        Task1 task1 = new Task1();
        task1.start();
        // task1.run() 이 아니라 start()를 한다는 것에 주목 => run 은 병렬처리 x

        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.start();

        // Task 3
        System.out.print("task3 start");
        for (int i = 301; i <= 399; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n task3 done");
        System.out.println("\n main done");


    }

    private static void basicWorkFlow() {
        // Task 1
        for (int i = 101; i <= 199; i++) {
            System.out.println(i + " ");
        }

        System.out.println("\n task1 done");

        // Task 2
        for (int i = 201; i <= 299; i++) {
            System.out.println(i + " ");
        }

        System.out.println("\n task2 done");

        // Task 3
        for (int i = 301; i <= 399; i++) {
            System.out.println(i + " ");
        }

        System.out.println("\n task3 done");
        System.out.println("\n main done");
    }
}
