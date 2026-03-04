import java.util.HashSet;

class Solution {
    public int totalElements(int[] arr) {
        // code here
        int n = arr.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            HashSet<Integer> set = new HashSet<>();
            int ln = 0;
            for (int j = i; j < n; j++) {
                set.add(arr[j]);
                ln++;
                if (set.size() > 2) {
                    break;
                }
                max = Math.max(max, ln);
            }
        }
        return max;
    }
}
