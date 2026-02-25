public class rotatearraybyk {
    static void rotatebyk(int arr[],int s,int e){
        while(s<e){
            int temp=arr[e];
            arr[e]=arr[s];
            arr[s]=temp;
            s++;
            e--;
        }
       
    }
    static void reverse(int arr[],int k){
        int n=arr.length;
        k=k%n;

        rotatebyk(arr,0,k-1);
        rotatebyk(arr,k,n-1);
        rotatebyk(arr,0,n-1);
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6};
        
        int k=2;
        reverse(arr,k);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
