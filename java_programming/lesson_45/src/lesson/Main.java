package lesson;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addFirst(4);
        System.out.println(deque);
        System.out.println("delete " + deque.removeLast());
        System.out.println(deque);

        // Stack
        Deque<Integer> stack = new LinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
    }
}
