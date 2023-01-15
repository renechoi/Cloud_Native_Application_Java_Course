package kosta.selfMission.others.concurrent;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCopyOnWriteArrayListRunner {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();

        // Thread => 3
        list.add("Ant");
        list.add("Bat");
        list.add("Cat");

        // Thread => 10000
        for (String element : list){
            System.out.println(element);
        }


        // concurrent CopyOnWriteArrayList 가 해주는 것은 add만 synchronized 될 수 있게 해준다
        // 즉, add와 get 연산에서 add 만 함으로써 add를 하는 과정에서 get은 계속해서 읽어올 수 있게 해준다
        // 만약에 이러한 작업이 불가능하다면 add 연산이 많아질 경우 그걸 전부 기다려야만 해서 비효율적인 프로세스가 된다





    }
}
