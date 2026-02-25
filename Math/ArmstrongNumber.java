public class armstrongnum {
    public static void main(String[] args){
        int n=153;
        int sum=0;
        int temp =n;
        while(n>0){
            int digit=n%10;
            sum=sum+(digit*digit*digit);
            n=n/10;
        }
        if(temp==sum){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not an armstrong number");
        }
    }
}
