import java.util.*;

public class AlternateAddition {

    static int altadd(ArrayList<Integer> list) {
        int res = 0;

        while (list.size() > 1) {

            // Add elements at even indexes: 0, 2, 4...
            for (int i = 0; i < list.size(); i += 2) {
                res += list.get(i);
            }

            // Remove elements at even indexes from right to left
            for (int i = list.size() - 1; i >= 0; i--) {
                if (i % 2 == 0) {
                    list.remove(i);
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }

        int ans = altadd(nums);

        System.out.println(ans);

        sc.close();
    }
}
