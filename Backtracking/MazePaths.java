public class counttotpathinmaze {
    public static int countpath(int i,int j,int n,int m){
        if(i==n||j==m){
            return 0;
        }
        if(i==n-1 &&j==m-1){
            return 1;
        }
        //move downwords
        int downpaths=countpath(i+1,j,n,m);
        //move rightwords
        int rightpaths=countpath(i,j+1,n,m);

        return downpaths+rightpaths;
    }
    public static void main(String[] args){
        int n=3;
        int m=3;
        int tot=countpath(0,0,n,m);
        System.out.println("Total paths in maze: "+tot);
    }
}
