class Solution {
    public int numberOfSubstrings(String s) {
        int[] ls=new int[3];
        Arrays.fill(ls,-1);
        int count=0;
        for(int i=0;i<s.length();i++){
            ls[s.charAt(i)-'a']=i;
            if(ls[0]!=-1 && ls[1]!=-1 && ls[2]!=-1){
                int min=s.length();
                for(int j=0;j<3;j++){
                    min=Math.min(min,ls[j]);
                }
                count+=(1+min);
            }
        }
        return count;
    }
}
