public class largesteleinarray {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,4,2};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }else if(arr[i]<max && arr[i]>max2){
                max2=arr[i];
            }
        }
    }
}
