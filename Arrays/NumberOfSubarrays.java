class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return check(nums,k)-check(nums,k-1);
    }
    private int check(int[] num,int k){
        if(k<0) return 0;
        int l=0,r=0,sum=0,count=0;
        while(r<num.length){
            sum+=num[r]%2;
            while(sum>k){
                sum-=num[l]%2;
                l++;
            }
            count+=(r-l+1);
            r++;
        }
        return count;
    }
}
