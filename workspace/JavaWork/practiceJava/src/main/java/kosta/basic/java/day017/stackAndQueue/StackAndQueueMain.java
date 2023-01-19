package kosta.basic.java.day017.stackAndQueue;

import java.util.LinkedList;
import java.util.Stack;

public class StackAndQueueMain {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        LinkedList<Integer> deque = new LinkedList<>();

        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        while(!deque.isEmpty()){
            System.out.println(deque.poll());
        }

    }

}
