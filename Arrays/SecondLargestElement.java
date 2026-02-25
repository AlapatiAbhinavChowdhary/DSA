public class secondlargele {
    static void second(int[] arr,int n){
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }else if(arr[i]>max2 && arr[i]<max){
                max2=arr[i];
            }
        }
        System.out.println(max2);
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,7,8,9,5};
        int n=arr.length;
        second(arr,n);
    }
}
