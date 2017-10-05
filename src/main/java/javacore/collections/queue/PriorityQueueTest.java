package javacore.collections.queue;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<String>();

        pq.add("Text 1");
        pq.add("Text 2");
        pq.add("Text 3");
        pq.add("Text 4");
        pq.add("Text 5");


        System.out.println(pq.poll());
        System.out.println(pq.size());
    }
}
