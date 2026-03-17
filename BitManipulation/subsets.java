class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> arr=new ArrayList<>();
        int n=nums.length;
        int subsetslen=1<<n;
        for(int i=0;i<subsetslen;i++){
            List<Integer> sub=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    sub.add(nums[j]);
                }
            }
            arr.add(sub);
        }
        return arr;
    }
}
