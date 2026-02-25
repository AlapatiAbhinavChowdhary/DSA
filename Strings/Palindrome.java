public class palindrome {
    public static void main(String[] args){
        int rev =0;
        int n=1331;
        int temp=n;
        while(n>0){
            int digit =n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        if(temp==rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
