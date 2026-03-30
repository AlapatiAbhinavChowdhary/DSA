package Queue;

import java.util.*;
class SimplePriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(5);
        pq.add(1);
        pq.add(2);
        System.out.println(pq.poll());
    }
}
