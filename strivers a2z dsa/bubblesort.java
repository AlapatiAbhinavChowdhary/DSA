public class bubblesort {

    public static void bubble(int[] arr) {
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            boolean swap = false;

            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }

            if (!swap) {
                break;
            }
        }
    }
}
