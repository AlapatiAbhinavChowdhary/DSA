public class selectionsort {
    public static void main(String[] args){
        int[] arr={5,2,4,6,1,3};
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
        System.out.print("Sorted array: ");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
