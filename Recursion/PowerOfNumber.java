public class recursion1 {
    public static int calcpow(int x,int n){
        if(n==0){
            return 1;
        }

        int  xpownm1=calcpow(x,n-1);
        int xpown=x*xpownm1;
        return xpown;

        // if(n%2==0){//if n is even
        //     return calcpow(x,n/2)*calcpow(x,n/2);
        // }else{//if n is odd
        //     return calcpow(x,n/2)*calcpow(x,n/2)*x;
        // }
    }
    public static void main(String[] args){
        int x=2,n=5;
        int result=calcpow(x,n);
        System.out.println(x+" raised to the power "+n+" is: "+result);
    }
}
