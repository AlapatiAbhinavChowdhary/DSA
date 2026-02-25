public class RecursiveBubbleSort {
    public static void bubblesort(int arr[],int n){
        if(n==1) return;
        for(int j=0;j<n-2;j++){
            if(arr[j]>arr[j+1]){
                int temp =arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        bubblesort(arr,n-1);
    }
    public static void main(String[] args){
        int arr[]={2,5,3,9};
        int n=arr.length;
        bubblesort(arr,n);
        for(int r:arr){
            System.out.println(r);
        }
    }
}

