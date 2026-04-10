package Stack;

import java.util.Stack;

class PrefixToPostfix {
    static String preToPost(String s) {
        int n = s.length();
        int i = n - 1;
        Stack<String> st = new Stack<>();
        while (i >= 0) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));
            } else {
                String t1 = st.pop();
                String t2 = st.pop();
                String conv = t1 + t2 + ch;
                st.push(conv);
            }
            i--;
        }
        return st.pop();
    }
}
