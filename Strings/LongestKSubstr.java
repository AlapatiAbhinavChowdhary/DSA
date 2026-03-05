import java.util.HashMap;

class Solution {
    public int longestKSubstr(String s, int k) {
        int n = s.length();
        int left = 0;
        int max = -1;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if (map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }

            if (map.size() == k) {
                max = Math.max(max, right - left + 1);
            }
        }

        return max;
    }
}
