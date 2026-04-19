import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleArea {

    private int[] nse(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        return ans;
    }

    private int[] pse(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        return ans;
    }

    public int largestRectangleArea(int[] heights) {
        int[] nsee = nse(heights);
        int[] psee = pse(heights);
        int n = heights.length;
        int max = 0;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, heights[i] * (nsee[i] - psee[i] - 1));
        }

        return max;
    }

    public static void main(String[] args) {
        LargestRectangleArea solution = new LargestRectangleArea();

        // Test Case 1
        int[] heights1 = {2, 1, 5, 6, 2, 3};
        System.out.println("Input: " + Arrays.toString(heights1));
        System.out.println("Output: " + solution.largestRectangleArea(heights1)); // Expected: 10

        // Test Case 2
        int[] heights2 = {2, 4};
        System.out.println("\nInput: " + Arrays.toString(heights2));
        System.out.println("Output: " + solution.largestRectangleArea(heights2)); // Expected: 4

        // Test Case 3
        int[] heights3 = {2, 1, 2};
        System.out.println("\nInput: " + Arrays.toString(heights3));
        System.out.println("Output: " + solution.largestRectangleArea(heights3)); // Expected: 3
    }
}
