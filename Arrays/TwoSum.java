import java.util.*;
public class twosum {
    static int[] two(int[] arr,int n,int t){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==t){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        int[] arr={1,2,4,3,6,4,6,9};
        int n=arr.length;
        int t=5;
        System.out.print(Arrays.toString(two(arr,n,t)));
    }
}
