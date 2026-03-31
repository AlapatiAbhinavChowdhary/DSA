package BitManipulation;
class missingNum {
        int missingnum(int arr[]) {
            // code here
            int n=arr.length;
            int ans=0;
            for(int i=0;i<n;i++){
                ans=ans^arr[i];
            }
            for(int i=1;i<=n+1;i++) ans=ans^i;
            return ans;
        }
        public static void main(String[] args){
            missingNum ob=new missingNum();
            int[] arr={1,2,3,5};
            System.out.println(ob.missingnum(arr));
        }
}
