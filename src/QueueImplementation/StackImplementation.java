package QueueImplementation;

// Queue Using Two Stacks build a queue that uses 2 diff diff stacks

import jdk.dynalink.beans.StaticClass;

import java.util.Stack;

public class StackImplementation {

    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        public static void add(int data) {

            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public static int remove() {
            if (s1.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.pop();
        }

        public static int peek() {
            if (s1.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {

    }
}
