import java.util.HashMap;

public class isomorphic {

    static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> ms = new HashMap<>();
        HashMap<Character, Character> mt = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (ms.containsKey(c1)) {
                if (ms.get(c1) != c2) return false;
            } else {
                ms.put(c1, c2);
            }

            if (mt.containsKey(c2)) {
                if (mt.get(c2) != c1) return false;
            } else {
                mt.put(c2, c1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));    // true
        System.out.println(isIsomorphic("f11", "b23"));    // false
        System.out.println(isIsomorphic("paper", "title"));// true
    }
}
