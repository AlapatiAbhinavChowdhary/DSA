public class lowerbound {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int x=4;
        int n=arr.length;
        int ans=n;
        int l=0,r=n-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(arr[mid]>=x){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        System.out.println(ans);
    }
}
