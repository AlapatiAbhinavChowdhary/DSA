import java.util.Stack;

public class RemoveKDigits {

    public String removeKdigits(String num, int k) {
        int n = num.length();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            char digit = num.charAt(i);

            while (!st.isEmpty() && k > 0 && st.peek() > digit) {
                st.pop();
                k--;
            }

            st.push(digit);
        }

        while (k > 0) {
            st.pop();
            k--;
        }

        if (st.isEmpty()) return "0";

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == '0') {
            sb.deleteCharAt(sb.length() - 1);
        }

        sb.reverse();

        if (sb.length() == 0) return "0";

        return sb.toString();
    }

    public static void main(String[] args) {
        RemoveKDigits solution = new RemoveKDigits();

        // Test Case 1
        String num1 = "1432219";
        int k1 = 3;
        System.out.println("Input: num = \"" + num1 + "\", k = " + k1);
        System.out.println("Output: \"" + solution.removeKdigits(num1, k1) + "\""); // Expected: "1219"

        // Test Case 2
        String num2 = "10200";
        int k2 = 1;
        System.out.println("\nInput: num = \"" + num2 + "\", k = " + k2);
        System.out.println("Output: \"" + solution.removeKdigits(num2, k2) + "\""); // Expected: "200"

        // Test Case 3
        String num3 = "10";
        int k3 = 2;
        System.out.println("\nInput: num = \"" + num3 + "\", k = " + k3);
        System.out.println("Output: \"" + solution.removeKdigits(num3, k3) + "\""); // Expected: "0"
    }
}
