package Arrays;


import java.util.*;
class RotateImage {
    public int[][] rotateimage(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[j][r - 1 - i] = matrix[i][j];
            }
        }
        return arr;
    }
}