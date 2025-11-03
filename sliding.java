public class sliding {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        int max = 0;
        int windowSum = 0;

        // calculate sum of first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        max = windowSum;

        // slide the window
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            max = Math.max(max, windowSum);
        }

        System.out.println("Maximum sum of " + k + "-length subarray is: " + max);
    }
}
