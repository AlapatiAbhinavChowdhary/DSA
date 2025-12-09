public class leetcode3432 {
    
}


// class Solution {
//     public int countPartitions(int[] nums) {
//         int count =0;
//         int n=nums.length;
//         for(int i=0;i<n-1;i++){
//             int ls=0;
//             for(int j=0;j<=i;j++){
//                 ls+=nums[j];
//             }

//             int rs=0;
//             for(int j=i+1;j<n;j++){
//                 rs+=nums[j];
//             }


//             if(Math.abs(ls-rs)%2==0) count++;
//         }
//         return count;
           
//     }
// }
