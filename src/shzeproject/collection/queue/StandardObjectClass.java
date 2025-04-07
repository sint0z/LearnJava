package shzeproject.collection.queue;

import java.util.PriorityQueue;

public class StandardObjectClass {
    public static void main(String[] args) {
        PriorityQueue<StandardObjectClass> queue = new PriorityQueue<>();

        StandardObjectClass obj1 = new StandardObjectClass();
        StandardObjectClass obj2 = new StandardObjectClass();

        queue.add(obj1);
        queue.add(obj2);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
