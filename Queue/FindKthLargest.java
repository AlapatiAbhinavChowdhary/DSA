package Queue;


import java.util.*;
class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            pq.add(nums[i]);
            if (pq.size() > k) pq.poll();
        }
        return pq.peek();
    }
}
