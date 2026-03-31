package BitManipulation;

public class findduplicates {
    public int findDuplicate(int[] arr) {
        // code here
        int ans=0;
        int n=arr.length;
        for(int i=1;i<n;i++){
            ans=ans^i;
        }
        for(int i=0;i<n;i++){
            ans=ans^arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        findduplicates ob=new findduplicates();
        System.out.println(ob.findDuplicate(new int[]{1,2,3,3,4}));
    }
}
