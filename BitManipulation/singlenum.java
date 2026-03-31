package BitManipulation;
import java.util.Arrays;
public class singlenum {
    public int[] singleNum(int[] arr) {
        // Code here
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
        }
        int rightmost=((xor)&(xor-1))^xor;
        int b1=0,b2=0;
        for(int i=0;i<arr.length;i++){
            if((arr[i] & rightmost)!=0){
                b1=b1^arr[i];
            }else{
                b2=b2^arr[i];
            }
        }
        if(b1<b2) return new int[]{b1,b2};
        return new int[]{b2,b1};
    }
    public static void main(String[] args) {
        singlenum s=new singlenum();
        System.out.println(Arrays.toString(s.singleNum(new int[]{1,2,2,3,3,4})));
    }
}
