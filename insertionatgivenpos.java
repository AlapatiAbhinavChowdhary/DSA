public class insertionatgivenpos {
    // public static int[] insertat(int[] arr,int pos,int val){
    //     int[] newarr=new int[arr.length+1];
    //     for(int i=0;i<pos;i++){
    //         newarr[i]=arr[i];
    //     }
    //     newarr[pos]=val;
    //     for(int i=pos;i<arr.length;i++){
    //         newarr[i+1]=arr[i];
    //     }
    //     return newarr;
    // }
    // public static void main(String[] args){
    //     int[] arr={1,3,4,5};
    //     int[] result=insertat(arr,3,2);
    //     for(int x:result){
    //         System.out.println(x);
    //     }
    // }
    static void ins(int[] arr,int n,int pos,int val){
        for(int i=n-1;i>=pos;i--){
            arr[i+1]=arr[i];
        }
        arr[pos]=val;
    }
    public static void main(String[] args){
        int[] arr=new int[6];
        int n=4;
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        ins(arr,n,3,2);
        n++;
    }
}
