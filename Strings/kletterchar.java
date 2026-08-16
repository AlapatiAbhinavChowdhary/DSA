import java.util.*;
public class kletterchar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
        int n=sc.nextInt();
        int[] freq=new int[26];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(freq[ch-'a']==k){
                System.out.print(ch);
                return;
            }
        }
        System.out.println("NONE")
        
    }
}
