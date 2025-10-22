public class factorial {
    public static int factorialofn(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorialofn(n-1);
        }
    }
    public static void main(String[] args){
        int number=5;
        int result=factorialofn(number);
        System.out.println("Factorial of "+number+" is: "+result);
    }

}
