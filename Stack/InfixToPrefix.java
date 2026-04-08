package Stack;

import java.util.Stack;

class InfixToPrefix {
    public static int prec(char ch) {
        if (ch == '^') return 3;
        else if (ch == '*' || ch == '/') return 2;
        else if (ch == '+' || ch == '-') return 1;
        else return -1;
    }

    public String infixToPrefix(String s) {
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                str.setCharAt(i, ')');
            } else if (str.charAt(i) == ')') {
                str.setCharAt(i, '(');
            }
        }
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    sb.append(st.pop());
                }
                st.pop();
            } else {
                if (ch == '^') {
                    while (!st.isEmpty() && prec(ch) <= prec(st.peek())) {
                        sb.append(st.pop());
                    }
                } else {
                    while (!st.isEmpty() && prec(ch) < prec(st.peek())) {
                        sb.append(st.pop());
                    }
                }
                st.push(ch);
            }
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
