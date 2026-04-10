package Stack;

import java.util.Stack;

class PostfixToPrefix {
    static String postToPre(String s) {
        int n = s.length();
        Stack<String> st = new Stack<>();
        int i = 0;
        while (i < n) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));
            } else {
                String t1 = st.pop();
                String t2 = st.pop();
                String con = ch + t2 + t1;
                st.push(con);
            }
            i++;
        }
        return st.pop();
    }
}
