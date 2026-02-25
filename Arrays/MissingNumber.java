public class missingnuminarr {
    public static void main(String[] args){
        int[] arr={1,2,3,5,6,7,9};
        int n=arr.length;
        for(int i=1;i<n;i++){
            boolean f=false;
            for(int j=0;j<n;j++){
                if(arr[j]==i){
                    f=true;
                    break;
                }
            }
            if(f==false){
                System.out.println(i);
            }
        }
    }
}


//for only single number missing 
class MissingNumSingle {
    public static void main(String[] args){
        int[] arr={1,2,3,5,6,7,9};
        int n=arr.length;
        int total=n+1;
        int sum=(total*(total+1))/2;
        int arrsum=0;
        for(int i=0;i<n;i++){
            arrsum+=arr[i];
        }
        System.out.println(sum-arrsum);
    }
}