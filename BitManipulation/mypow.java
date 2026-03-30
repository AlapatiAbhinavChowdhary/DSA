package BitManipulation;

public class mypow {

    public double myPow(double x, int n) {
        long nn = n;

        if (nn < 0) {
            x = 1 / x;
            nn = -nn;
        }

        double ans = 1.0;

        while (nn > 0) {
            if (nn % 2 == 1) {
                ans *= x;
            }
            x *= x;
            nn /= 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        mypow obj = new mypow();

        double result = obj.myPow(2.0, 10);
        System.out.println(result);   // Expected: 1024.0

        double result2 = obj.myPow(2.0, -2);
        System.out.println(result2);  // Expected: 0.25
    }
}
