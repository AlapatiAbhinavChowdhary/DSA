public class rotatearray {
    public static void rotate(int arr[]){
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[n-1-i];
            arr[n-1-i]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        rotate(arr);
        
    }
}
