public class maxcircularsubarraysum {
    public static int kadane(int[] arr){
        int tot=0;
        int currmax=0,maxsum=arr[0];
        int currmin=0,minsum=arr[0];
        for(int num:arr){
            tot+=num;

            currmax=Math.max(num,currmax+num);
            maxsum=Math.max(maxsum,currmax);
            currmin=Math.min(num,currmin+num);
            minsum=Math.min(minsum,currmin);
        }
        if(tot==minsum) return maxsum;
        return Math.max(maxsum,tot-minsum);
    }
    public static void main(String[] args){
        int arr[]={5,-2,3,4};
        System.out.println("maximum circular subarray sum is: "+kadane(arr));
    }

}
