class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr=new int[101];
        for(int a:nums){
            arr[a]++;
        }
        int max=0;
        for(int i=0;i<101;i++){
            max=Math.max(max,arr[i]);
        }
        int c=0;
        for(int i=0;i<101;i++){
            if(arr[i]==max) c+=arr[i];
        }
        if(c==0) return nums.length;
        return c;
    }
}
