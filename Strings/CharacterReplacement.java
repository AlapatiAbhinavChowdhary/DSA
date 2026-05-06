class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0,maxl=0,maxf=0;
        int[] hash=new int[26];
        while(r<s.length()){
            char ch=s.charAt(r);
            hash[ch-'A']++;
            maxf=Math.max(maxf,hash[ch-'A']);
            if((r-l+1)-maxf>k){
                hash[s.charAt(l)-'A']--;
                maxf=0;
                for(int i=0;i<26;i++){
                    maxf=Math.max(maxf,hash[i]);
                }
                l++;
            }
                maxl=Math.max(maxl,(r-l+1));
            
            r++;
        }
        return maxl;
    }
}
