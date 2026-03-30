package BitManipulation;
import java.util.Arrays;
public class SingleNumber {
    public int[] singlenum(int[] nums){
        int n=nums.length;
        long xor=0;
        for(int i=0;i<n;i++){
            xor=xor^nums[i];
        }
        int rightmost=(int)(xor&(xor-1))^(int)(xor);
        int xor1=0,xor2=0;
        for(int i=0;i<n;i++){
            if((nums[i]&rightmost)!=0){
                xor1=xor1^nums[i];
            }else{
                xor2=xor2^nums[i];
            }
        }
        return new int[]{xor1,xor2};
    }
    public static void main(String[] args){
        int[] nums={1,1,2,3,3,4,5,5};
        SingleNumber sol=new SingleNumber();


        System.out.println(Arrays.toString(sol.singlenum(nums)));
    }
}
