package BitManipulation;

class XorSwap {

    public static void swap(int[] arr) {
        arr[0] = arr[0] ^ arr[1];
        arr[1] = arr[0] ^ arr[1];
        arr[0] = arr[0] ^ arr[1];
    }

    public static void main(String[] args) {
        int[] arr = { 5, 7 };

        swap(arr);

        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
