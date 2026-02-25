import java.util.*;
class mergesor {
    public void merge(int arr[],int low,int mid,int high){
        List<Integer> temp=new ArrayList<>();
        int left =low,right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }

    }
    public void merges(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int mid=low+(high-low)/2;
        merges(arr,low,mid);
        merges(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
}
public class mergesort {
    public static void main(String[] args){
        int arr[]={38,27,43,3,9,82,10};
        mergesor ms=new mergesor();
        ms.merges(arr,0,arr.length-1);
        System.out.println("Sorted array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
