package BitManipulation;

class CheckIthBitOptimal {
    public static boolean checkIthBit(int n, int i) {
        return (n & (1 << i)) != 0;
    }

    public static void main(String[] args) {
        int n = 5;
        int i = 2;
        if (checkIthBit(n, i)) {
            System.out.println("set");
        } else {
            System.out.println("not set");
        }
    }
}
