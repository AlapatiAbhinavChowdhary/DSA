public class swap {
    public static void swapping(int a,int b){
        int temp=a;
        b=a;
        a=temp;
        System.out.println(a);
    }
    public static void main(String args[]){
        int a=20;
        int b=30;
        swapping(a,b);
        
    }
}
