class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node end=new Node(x);
        if(head==null){
            head=end;
            return head;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=end;
        
        return head;
    }
}
