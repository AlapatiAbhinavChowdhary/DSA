public class rightrottation {
    static void right(int[] arr,int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=arr[s];
            s++;
            e--;
        }
    }
    static void reverse(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        right(arr,0,k-1);
        right(arr,k,n-1);
        right(arr,0,n-1);
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int k=2;
        reverse(arr,k);
    }
}
