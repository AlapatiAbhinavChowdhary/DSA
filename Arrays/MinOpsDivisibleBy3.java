public class leetcode3190 {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int count=0;
        for(int x:arr){
            if(x%3!=0){
                count++;
                
            }
        }
        System.out.println(count);
        //in case they asked to modify the array as well
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]%3==0){
        //         continue;
        //     }else if(arr[i]%3==1){
        //         arr[i]-=1;
        //     }else{
        //         arr[i]+=1;
        //     }
        // }
    }
}
