public class palindrome {
    public boolean palindromecheck(int i,String s){
        if(i>=s.length()/2) return true;

        if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
        return palindromecheck(i+1,s);
    }
}
