public class productofprimesin_n {
    public static void main(String[] args){
        int n=2754;
        int p=1;
        boolean f=false;
        while(n>0){
            int digit=n%10;
            if(digit==2 || digit==3 || digit==5 || digit==7){
                p=p*digit;
                f=true;
            }
            n=n/10;

        }
        if(f){
            System.out.println(p);
        }
        else{
            System.out.println("No prime digit");
        }
    }
}
