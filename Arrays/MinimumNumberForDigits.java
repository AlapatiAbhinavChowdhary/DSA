import java.util.*;

public class MinimumNumberForDigits {

    static int finddigits(long l) {
        int count = 0;

        while (l > 0) {
            l /= 10;
            count++;
        }

        return count;
    }

    static long findmin(long l, long r, long t) {

        long curr = l;

        while (curr <= r) {

            long digits = finddigits(curr);

            long sameenddigit = 1;

            for (int i = 0; i < digits; i++) {
                sameenddigit *= 10;
            }

            sameenddigit -= 1;

            long end = Math.min(r, sameenddigit);

            long numbers = end - curr + 1;

            long totdig = numbers * digits;

            if (t > totdig) {

                t -= totdig;

                curr = end + 1;

            } else {

                long numneeded = (t + digits - 1) / digits;

                return curr + numneeded - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long l = sc.nextLong();
        long r = sc.nextLong();
        long t = sc.nextLong();

        long ans = findmin(l, r, t);

        System.out.println(ans);

        sc.close();
    }
}
