public class insertionatgivenpos {
    public static int[] insertat(int[] arr,int pos,int val){
        int[] newarr=new int[arr.length+1];
        for(int i=0;i<pos;i++){
            newarr[i]=arr[i];
        }
        newarr[pos]=val;
        for(int i=pos;i<arr.length;i++){
            newarr[i+1]=arr[i];
        }
        return newarr;
    }
    public static void main(String[] args){
        int[] arr={1,3,4,5};
        int[] result=insertat(arr,3,2);
        for(int x:result){
            System.out.println(x);
        }
    }
}
