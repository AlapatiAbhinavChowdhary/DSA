public class binaryfndl {
    public static int f(int nums[],int target){
        int s=0;
        int e=nums.length-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                ans=mid;
                e=mid-1;
            }else if(nums[mid]<target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return ans;

    }
    public static int l(int nums[],int target){
        int s=0;
        int e=nums.length-1;
        int ans1=-1;
        while(s<=e){
            int mid =s+(e-s)/2;
            if(nums[mid]==target){
                ans1=mid;
                s=mid+1;
            }else if(nums[mid]<target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return ans1;
    }
    public static void main(String[] args){
        int [] arr={1,1,2,3,4,5,6,7,7,7,8,8,8,9,9,9,10};
        int target=4;
        System.out.println("first occurance at index: "+f(arr,target));
        System.out.println("last occurance at index: "+l(arr,target));
    }
}
