class Solution {
    public Node deleteHead(Node head) {
        // code here
        if(head==null){
            return null;
        }
        head=head.next;
        return head;
    }
}
