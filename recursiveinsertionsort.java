public class recursiveinsertionsort {
    static void insertionsort(int[] arr,int i,int n){
        if(i==n) return;
        int j=i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
            j--;
        }
        insertionsort(arr,i+1,n);
    }
    public static void main(String[] args){
        int[] arr={2,3,1,4,6,7,5,3,0};
        int n=arr.length;
        insertionsort(arr,0,n);
    }
}
