package Graphs;
import java.util.*;

public class TreeDepth {

    static ArrayList<Integer>[] graph;
    static int[] depth;

    static void dfs(int node, int parent, int d) {

        depth[node] = d;

        for (int child : graph[node]) {

            if (child != parent) {
                dfs(child, node, d + 1);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        graph = new ArrayList[n + 1];

        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // Read n-1 edges
        for (int i = 0; i < n - 1; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

            graph[u].add(v);
            graph[v].add(u);
        }

        depth = new int[n + 1];

        dfs(1, -1, 0);

        for (int i = 1; i <= n; i++) {
            System.out.println("Node " + i + " -> Depth = " + depth[i]);
        }
    }
}