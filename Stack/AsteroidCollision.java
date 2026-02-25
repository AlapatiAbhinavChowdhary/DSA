class Solution {
    public int[] asteroidCollision(int[] as) {
        Stack<Integer> st=new Stack<>();
        for(int a:as){
            if(a>0){
                st.push(a);
            }else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<-a){
                    st.pop();
                }
                if(st.isEmpty() || st.peek()<0){
                    st.push(a);
                }
                if(st.peek()==-a){
                    st.pop();
                }
                
            }
        }
        int[] res=new int[st.size()];
        int i=st.size()-1;
        while(!st.isEmpty()){
            res[i--]=st.pop();
        }
        return res;

    }
}
