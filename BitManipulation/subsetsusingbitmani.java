// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class subsetsusingbitmani {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int n=arr.length;
        int subrange=1<<n;
        ArrayList<ArrayList<Integer>> nums=new ArrayList<>();
        for(int mask=0;mask<(1<<n);mask++){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                if((mask&(1<<i))!=0){
                    temp.add(arr[i]);
                }
            }
            nums.add(temp);
        }
        System.out.println(nums);
    }
}
