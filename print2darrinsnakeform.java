class Solution {
    // Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        int n=matrix.length;
        int j=0;
        for(int i=0;i<matrix.length;i++){
            
            if(j==0){
                while(j<n){
                    al.add(matrix[i][j]);
                    j++;
                    
                }
                j=n-1;
            }else{
                while(j>=0){
                    al.add(matrix[i][j]);
                    j--;
                }
                j=0;
            }
        }
        return al;
    }
}
