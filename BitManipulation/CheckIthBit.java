package BitManipulation;

class CheckIthBit {
    public static boolean checkIthBit(int n, int i) {
        String binary = Integer.toBinaryString(n);
        if (i > binary.length()) return false;
        return binary.charAt(binary.length() - 1 - i) == '1';
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
