class Main {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;
        int[] nums=new int[n];
        int m=0;
        for(int i=0;i<arr.length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>max) max=arr[i][j];
            }
            nums[m]=max;
            m++;
        }
        for(int j=0;j<nums.length;j++){
            System.out.print(nums[j]+" ");
        }
    }
}
