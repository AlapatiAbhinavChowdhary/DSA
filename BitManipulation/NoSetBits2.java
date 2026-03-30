package BitManipulation;

class NoSetBits2 {
    public static int nosetbits(int n) {
        int c = 0;
        while (n > 0) {
            c += (n & 1);
            n >>= 1;
        }
        return c;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(nosetbits(n));

    }
}
