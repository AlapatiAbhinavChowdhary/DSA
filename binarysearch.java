public class binarysearch {
    static int binary(int[] arr,int n,int t){
        int l=0,r=n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==t){
                return mid;
            }else if(arr[mid]>t){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        int t=7;
        binary(arr,n,t);
    }
}
