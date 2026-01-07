package Stacks;

import java.util.*;

public class InternalStack {
    static void main() {
//        Stack<Integer> stack=new Stack<>();
//        stack.push(10);
//        stack.push(55);
//        System.out.println("Tol= "+stack.peek());
//        LinkedList<Integer>list=new LinkedList<>();
//        list.push(10);
//        list.push(55);
//        System.out.println("TOSLL= "+stack.peek());
        ArrayDeque<Integer> deque=new ArrayDeque<>();
        deque.add(25);
        deque.addFirst(55);
        System.out.println(deque);
    }
}
