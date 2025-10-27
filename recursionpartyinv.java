public class recursionpartyinv {
    public static int callguest(int n){
        if(n==0||n==1||n==2){
            return n;
        }
        //single
        int single=callguest(n-1);
        //pair
        int pair=(n-1)*callguest(n-2);
        return single+pair;
    }
    public static void main(String[] args){

    }
}
