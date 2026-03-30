package BitManipulation;

class NoSetBits {
    public static int nosetbits(int n) {
        int c = 0;
        while (n > 0) {
            n &= (n - 1);
            c++;
        }
        return c;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(nosetbits(n));

    }
}
