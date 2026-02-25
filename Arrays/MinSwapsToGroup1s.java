class Solution {
    public int minSwaps(int[] nums) {
        int ws=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==1) ws++;
        }
        if(ws<=1) return 0;
        int c=0;
        for(int i=0;i<ws;i++){
            if(nums[i]==1) c++;
        }
        int a=c;
        for(int i=ws;i<n+ws;i++){
            if(nums[(i-ws)%n]==1) c--;
            if(nums[i%n]==1) c++;
            a=Math.max(a,c);
        }
        return ws-a;
    }
}
