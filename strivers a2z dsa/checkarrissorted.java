class solution{
    public static boolean issorted(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
}
public class checkarrissorted {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        System.out.println(solution.issorted(arr));
    }
}
