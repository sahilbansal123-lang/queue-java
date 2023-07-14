package QueueImplementation;
//    Queue: is a data structure in computer science that represents a collection of elements arranged in a linear
//           order,similar to a stack. The key difference is that a queue follows the First-In-First-Out (FIFO)
//           principle, where the first element added to the queue is the first one to be removed.
//
//           In a queue, elements are added at one end, known as the rear or tail of the queue,
//           and removed from the other end, known as the front or head of the queue.
//           This ensures that elements are processed in the order they are added.
//
//          The Operations commonly supported by a Queue data structure include:
//
//              -Enqueue: Add an element to the rear of the queue.
//              -Dequeue: Remove and return the element at the front of the queue.
//              -Peek: Return the element at the front of the queue without removing it.
//              -IsEmpty: Check if the queue is empty.
//              -Size: Return the number of elements currently in the queue.

//          Queues can be implemented using arrays or linked lists. They are commonly used in algorithms that
//          involve processing items in a specific order, such as breadth-first search or scheduling tasks in a
//          multitasking operating system.

public class QueueClass {

    // Created a node
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }


    static class Queue {
        static Node head = null;
        static Node tail = null;


        public static boolean isEmpty() {
            return head == null && tail == null;
        }


        public static void add(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) {
                tail = head = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }


        public static int remove() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            //single node
            if(head == tail) {
                tail = null;
            }
            head = head.next;
            return front;
        }


        public static int peek() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            return head.data;
        }
    }
    public static void main(String args[]) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);


        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
