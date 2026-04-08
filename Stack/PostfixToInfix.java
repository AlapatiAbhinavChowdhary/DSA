package Stack;

import java.util.Stack;

class PostfixToInfix {
    static String postToInfix(String exp) {
        Stack<String> st = new Stack<>();
        int i = 0;
        while (i < exp.length()) {
            char ch = exp.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));
            } else {
                String t1 = st.pop();
                String t2 = st.pop();
                String con = "(" + t2 + ch + t1 + ")";
                st.push(con);
            }
            i++;
        }
        return st.peek();
    }
}
