package Graphs;

class NumberOfProvinces {

    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;
        boolean[] vis = new boolean[n];
        int provinces = 0;

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                dfs(isConnected, i, vis);
                provinces++;
            }
        }

        return provinces;
    }

    private void dfs(int[][] isConnected, int node, boolean[] vis) {

        vis[node] = true;

        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[node][j] == 1 && !vis[j]) {
                dfs(isConnected, j, vis);
            }
        }
    }
}
