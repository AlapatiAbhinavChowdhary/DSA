public class floorceil {
    public static int findfloor(int[] arr,int x){
        int l=0,r=arr.length-1;
        int ans=-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(arr[mid]<=x){
                ans=arr[mid];
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return ans;
    }
    public static int findceil(int[] arr,int x){
        int l=0,r=arr.length-1;
        int ans=-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(arr[mid]>=x){
                ans=arr[mid];
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
    public int[] getfloorceil(int[] arr,int x){
        int f=findfloor(arr,x);
        int c=findceil(arr,x);
        return new int[]{f,c};
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int x=5;
        floorceil fc = new floorceil();
        int[] result = fc.getfloorceil(arr, x);
        System.out.println("Floor: " + result[0] + ", Ceil: " + result[1]);
    }
}
