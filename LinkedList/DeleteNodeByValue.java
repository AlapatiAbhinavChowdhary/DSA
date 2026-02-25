class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        if(head ==null){
            return head;
        }
        if(x==1) {
            head=head.next;
            return head;
        }
        int c=2;
        Node temp=head;
        while(x!=c){
            temp=temp.next;
            c++;
        }
        if(temp.next.next==null) temp.next=null;
        else
        temp.next=temp.next.next;
        return head;
    }
}
