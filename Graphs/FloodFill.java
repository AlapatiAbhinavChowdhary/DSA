package Graphs;

class FloodFill {
    void dfs(int[][] image, int sr, int sc, int ne, int original) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length)
            return;
        if (image[sr][sc] != original)
            return;
        image[sr][sc] = ne;
        dfs(image, sr + 1, sc, ne, original);
        dfs(image, sr - 1, sc, ne, original);
        dfs(image, sr, sc + 1, ne, original);
        dfs(image, sr, sc - 1, ne, original);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc];
        if (original == color)
            return image;
        dfs(image, sr, sc, color, original);
        return image;
    }
}
