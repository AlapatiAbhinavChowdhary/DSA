import java.util.Scanner;

public class CountSubstringOccurrences {

    static int countOccurrences(String a, String b) {

        int count = 0;

        for (int i = 0; i <= a.length() - b.length(); i++) {

            if (a.substring(i, i + b.length()).equals(b)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        System.out.println(countOccurrences(a, b));

        sc.close();
    }
}
