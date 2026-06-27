import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n==1){
            System.out.println(arr[0]);
            return;
        }
        if(arr[0]!=arr[1]){
            System.out.println(arr[0]);
            return;
        }
        if(arr[n-1]!=arr[n-2]){
            System.out.println(arr[n-1]);
            return;
        }
        int l=1,r=n-2;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]!=arr[mid+1]&&arr[mid]!=arr[mid-1]){
                System.out.println(arr[mid]);
                return;
            }
            if(mid%2==0&&arr[mid]==arr[mid+1]||mid%2==1&&arr[mid-1]==arr[mid]){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
    }
}
