public class rotatearrayby1 {
    static void rotate(int arr[]){
        int n=arr.length;
        int fi=arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=fi;
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        rotate(arr);
    }
}
