class Solution {
    public boolean searchKey(Node head, int key) {
        // Code here
        Node temp=head;
        if(head.data==key) return true;
        while(temp!=null){
            if(temp.data==key) return true;
            temp=temp.next;
        }
        return false;
    }
}
