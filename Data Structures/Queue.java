
// waiting in a line at the grocery store
// first come first serve

import javax.management.RuntimeErrorException;

public class Queue<T> {

    private java.util.LinkedList<T> list = new java.util.LinkedList<T>();

    public Queue() {
    }

    public Queue(T firstElem) {
        offer(firstElem);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    // enqueue
    void offer(T elem) {
        list.addLast(elem);
    }

    // dequeue
    public T poll() {
        if (isEmpty()) {
            throw new RuntimeErrorException(null, "Queue is empty");
        }
        return list.removeFirst();
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeErrorException(null, "Queue is empty");
        }
        System.out.println(list.peekFirst());
        return list.peekFirst();
    }

    public java.util.Iterator<T> iterator() {
        return list.iterator();
    }

    public static void main(String[] args) {
        Queue<Integer> q = new Queue<Integer>();
        q.offer(12);
        q.offer(13);
        q.offer(14);
        q.offer(15);
        q.offer(66);
        q.offer(67);
        q.offer(68);
        q.offer(69);
        q.offer(70);
        System.out.println("Test");
        q.peek();
        q.poll();
        q.peek();
        q.poll();
        q.poll();
        q.poll();
        q.peek();
        q.poll();
        q.peek();

    }
}
