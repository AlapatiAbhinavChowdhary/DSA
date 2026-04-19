import java.util.Arrays;

public class SubArrayRanges {

    public long subArrayRanges(int[] nums) {
        long sum = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int min = nums[i];
            int max = nums[i];

            for (int j = i; j < n; j++) {
                min = Math.min(nums[j], min);
                max = Math.max(nums[j], max);
                sum += (max - min);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        SubArrayRanges solution = new SubArrayRanges();

        // Test Case 1
        int[] nums1 = {1, 2, 3};
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output: " + solution.subArrayRanges(nums1)); // Expected: 4

        // Test Case 2
        int[] nums2 = {1, 3, 3};
        System.out.println("\nInput: " + Arrays.toString(nums2));
        System.out.println("Output: " + solution.subArrayRanges(nums2)); // Expected: 4

        // Test Case 3
        int[] nums3 = {4, -2, -3, 4, 1};
        System.out.println("\nInput: " + Arrays.toString(nums3));
        System.out.println("Output: " + solution.subArrayRanges(nums3)); // Expected: 59
    }
}
