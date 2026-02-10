class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        ListNode nex=head;
        while(curr!=null){
            nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }
        return prev;
    }
}
