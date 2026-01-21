public class leetcode961 {
    public int rep(int[] arr){
        int n=arr.length/2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);


            if(map.get(num)==n){
                return num;
            }
        }
        return -1;
    }

}
