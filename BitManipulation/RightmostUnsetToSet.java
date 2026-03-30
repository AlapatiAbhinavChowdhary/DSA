package BitManipulation;

class RightmostUnsetToSet {
    public static int rightmosttoset(int n) {
        return n | (n + 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(rightmosttoset(n));

    }
}
