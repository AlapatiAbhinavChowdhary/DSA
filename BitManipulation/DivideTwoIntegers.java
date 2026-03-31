package BitManipulation;

public class DivideTwoIntegers {
    private int xortilln(int n) {
        if (n < 0) return 0;
        if (n % 4 == 0) return n;
        if (n % 4 == 1) return 1;
        if (n % 4 == 2) return n + 1;
        return 0; // n % 4 == 3
    }

    public int findrangexor(int l, int r) {
        return xortilln(l - 1) ^ xortilln(r);
    }

    public static void main(String[] args) {
        int l = 2, r = 5;
        DivideTwoIntegers d = new DivideTwoIntegers();
        int an = d.findrangexor(l, r);
        System.out.println(an);
    }
}
