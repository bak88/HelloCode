package Java.DZ.dz05;

import java.util.LinkedList;

class MyQueue<T> {

    LinkedList<T> linkedList = new LinkedList<>();


    public void enqueue(T element) {
        linkedList.addLast(element);
    }

    public T dequeue() {
        return linkedList.removeFirst();
    }

    public T first() {
        return linkedList.getFirst();
    }

    public LinkedList<T> getElements() {
        return linkedList;
    }
}
public class PrinterMyQueue {
    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();

        queue.enqueue(1);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(5);

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();

        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}
