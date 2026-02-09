class Solution {
    public Node insertAtFront(Node head, int x) {
        // code here
        Node newhead=new Node(x);
        newhead.next=head;
        head=newhead;
        return head;
    }
}
