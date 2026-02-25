

public class firstoccndl{
    public static void main(String[] args){
        int [] arr={1,2,3,4,2,1,2,3,4,4,2,1,1,3,4,4,6,7,8,9,12,2,2,1};
        int f=-1;
        int last=arr.length-1;
        int target=1;
        for(int i=0;i<=last;i++){
            if(arr[i]==target){
                f=i;
                break;
            }

        }
        if(f==-1){
            System.out.println("target not found");
            return;
        }
        for(int j=last;j>=f;j--){
            if(arr[j]==target){
                System.out.println(f);
                System.out.println(j);
                return;
            }
        }
    }
}



















