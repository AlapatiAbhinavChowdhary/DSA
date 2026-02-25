public class recursion3 {
    public static int placetails(int n,int m){
        if(n==0||m==0||n<m){
            return 0;
        }
        if(n==m||m==1){
            return 1;
        }
        //place tile vertically
        int vert=placetails(n-1,m);
        //place tile horizontally
        int hori=placetails(n-m,m);
        return vert+hori; 
    }
    public static void mian(String[] args){
        int n=4,m=2;
        int ways=placetails(n,m);
        System.out.println("Total ways to place tiles: "+ways);
    }
}
