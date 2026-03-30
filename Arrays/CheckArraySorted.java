package Arrays;


import java.util.*;
class CheckArraySortedHelper {
    public boolean issorted(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i-1] > arr[i]){
                return false;
            }
        }
        return true;
    }
}
public class CheckArraySorted {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        CheckArraySortedHelper sol = new CheckArraySortedHelper();
        System.out.println(sol.issorted(arr));
    }
}

