import java.util.*;
public class largestele {
    static void largest(int[] arr,int n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print(max);
        // Arrays.sort(arr);
        // System.out.print(arr[n-1]);
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        largest(arr,n);
    }
}
