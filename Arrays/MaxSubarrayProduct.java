public class maxsubarrayproduct {
    public static int maxp(int[] arr){
        int maxp=arr[0];
        int minp=arr[0];
        int r=arr[0];
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            if(curr<0){
                int temp=maxp;
                maxp=minp;
                minp=temp;
            }
            maxp=Math.max(curr,curr*maxp);
            minp=Math.min(curr,curr*minp);
            r=Math.max(r,maxp);
        }
        return r;
    }
    public static void main(String[] args){
        int arr[]={2,3,-2,4};
        System.out.println("maximum product subarray is: "+maxp(arr));


    }
}
