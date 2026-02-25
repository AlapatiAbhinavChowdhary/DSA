public class quicksort {
    public static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;


    }
    public static void quick(int arr[],int low,int high){
        if(low<high){
            int pivot=partition(arr,low,high);
            quick(arr,low,pivot-1);
            quick(arr,pivot+1,high);
        }
    }
    public static void main(String[] args){
        int[] arr={1,3,4,2,3,5,6,7,5};
        int n=arr.length;
        quick(arr,0,n-1);

    }
}