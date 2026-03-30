package LinkedList;


import java.util.*;
class DeleteHead {
    public Node deleteHead(Node head) {
        // code here
        if(head==null){
            return null;
        }
        head=head.next;
        return head;
    }
}
