public class recursion1 {
    public static int calcpow(int x,int n){
        if(n==0){
            return 1;
        }

        int  xpownm1=calcpow(x,n-1);
        int xpown=x*xpownm1;
        return xpown;
    }
    public static void main(String[] args){
        int x=2,n=5;
        int result=calcpow(x,n);
        System.out.println(x+" raised to the power "+n+" is: "+result);
    }
}
