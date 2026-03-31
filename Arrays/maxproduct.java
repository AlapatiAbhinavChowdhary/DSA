
import java.util.Arrays;

public class maxproduct {
    public int maxProduct(int[] nums) {
        int maxp=nums[0];
        int minp=nums[0];
        int r=nums[0];
        for(int i=1;i<nums.length;i++){
            int curr=nums[i];
            if(curr<0){
                int temp=maxp;
                maxp=minp;
                minp=temp;
            }
            maxp=Math.max(curr,curr*maxp);
            minp=Math.min(curr,curr*minp);
            r=Math.max(r,maxp);
        }
        return r;
    }
    public static void main(String[] args) {
        maxproduct ob=new maxproduct();
        System.out.println((ob.maxProduct(new int[]{1,2,3,3,4})));
    }
}
