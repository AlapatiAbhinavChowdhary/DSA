class solution{
    public int sumoddfreq(int[] arr){
        int n=arr.length;
        int sum=0;
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                count++;
            } else{
                if(count%2!=0){
                    sum+=arr[i-1];
                }
                count=1;
            }
        }
        if(count%2!=0){
            sum+=arr[n-1];
        }
        return sum;
    }
}