import java.util.*;
class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.add(5);
        pq.add(1);
        pq.add(2);
        System.out.println(pq.poll());
    }
}
