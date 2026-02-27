import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class BfsOfGraph {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n = adj.size();
        ArrayList<Integer> arr = new ArrayList<>();
        boolean[] visited = new boolean[n];
        Queue<Integer> pq = new LinkedList<>();
        int src = 0;
        visited[src] = true;
        pq.add(src);
        while (!pq.isEmpty()) {
            int curr = pq.poll();
            arr.add(curr);
            for (int x : adj.get(curr)) {
                if (!visited[x]) {
                    visited[x] = true;
                    pq.add(x);
                }
            }
        }
        return arr;
    }
}
