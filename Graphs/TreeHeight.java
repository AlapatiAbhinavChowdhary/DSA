package Graphs;
import java.util.*;

public class TreeHeight {

    static ArrayList<Integer>[] graph;
    static int[] height;

    static int dfs(int node, int parent) {

        int maxHeight = 0;

        for (int child : graph[node]) {

            if (child != parent) {

                int childHeight = dfs(child, node);

                maxHeight = Math.max(maxHeight, childHeight + 1);
            }
        }

        height[node] = maxHeight;

        return maxHeight;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        graph = new ArrayList[n + 1];

        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        System.out.println("Enter " + (n - 1) + " edges:");

        for (int i = 0; i < n - 1; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

            graph[u].add(v);
            graph[v].add(u);
        }

        height = new int[n + 1];

        dfs(1, -1);

        System.out.println("\nHeight of every node:");

        for (int i = 1; i <= n; i++) {
            System.out.println("Node " + i + " -> Height = " + height[i]);
        }
    }
}