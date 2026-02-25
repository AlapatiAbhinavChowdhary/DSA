// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int count = 0;

//         for (int i = 0; i < nums.length; i++) {
//             int sum = 0;

//             for (int j = i; j < nums.length; j++) {
//                 sum += nums[j];

//                 if (sum == k) {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }



import java.util.*;

public class subarraysumequalk {
    public static void main(String args[]){
        int arr[]={10,2,-2,-20,10};
        int k=-10;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int ans=0;
        int sum=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }
        System.out.println(ans);
    }
}