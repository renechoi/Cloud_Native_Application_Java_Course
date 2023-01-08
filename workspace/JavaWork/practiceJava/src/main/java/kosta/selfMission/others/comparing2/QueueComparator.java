package kosta.selfMission.others.comparing2;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueComparator {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.addAll(List.of("Zebra", "Monkey", "Cat"));
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        Queue<String> queue2 = new PriorityQueue<>(new StringLengthComparator());
        queue2.addAll(List.of("Zebra", "Monkey", "Cat"));
        System.out.println(queue2.poll());
        System.out.println(queue2.poll());
        System.out.println(queue2.poll());
        System.out.println(queue2.poll());
    }
}


class StringLengthComparator implements Comparator<String>{
    @Override
    public int compare(String value1, String value2) {
        return Integer.compare(value1.length(), value2.length());
    }
}