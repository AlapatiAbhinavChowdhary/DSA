package BitManipulation;

public class findunique {
        public static int findUnique(int[] arr) {
            // code here
            int ans=0;
            for(int i=0;i<arr.length;i++){
                ans=ans^arr[i];
            }
            return ans;
        }
        public static void main(String[] args) {
           System.out.println(findUnique(new int[]{1,1,2,2,3,5,5}));
        }

}
