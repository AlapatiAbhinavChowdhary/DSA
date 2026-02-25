class Solution {
    public ArrayList<Integer> boundaryTraversal(int mat[][]) {
        // code here
        ArrayList<Integer> a=new ArrayList<>();
        int r=mat.length;
        int c=mat[0].length;
        if(r==1){
            for(int i=0;i<c;i++){
                a.add(mat[0][i]);
            }
            return a;
        }
        if(c==1){
            for(int i=0;i<r;i++){
                a.add(mat[i][0]);
            }
            return a;
        }
        
        for(int i=0;i<=c-1;i++){
            a.add(mat[0][i]);
        }
        for(int i=1;i<r;i++){
            a.add(mat[i][c-1]);
        }
        for(int i=c-2;i>=0;i--){
            a.add(mat[r-1][i]);
        }
        for(int i=r-2;i>=1;i--){
            a.add(mat[i][0]);
        }
        return a;
    }
}
