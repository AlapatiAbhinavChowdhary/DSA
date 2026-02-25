public class checkanynumoccueroddnumberoftimesinarr {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,1,2,3,4,5,1};
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            int count=0;
          
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j] ){
                    count++;
                    
                }
            }
            if(count%2!=0){
            System.out.println(arr[i]);
        }
        
        }
    }
}
