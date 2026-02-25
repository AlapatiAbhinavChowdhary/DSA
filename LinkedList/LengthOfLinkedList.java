class Solution {
    public int getCount(Node head) {
        // code here
        int n=1;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            n++;
        }
        return n;
        
    }
}
