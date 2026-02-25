public class reversearr {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+"");
        }
    }
}


//another method
class reversearr2{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int s=0,e=n-1;
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
