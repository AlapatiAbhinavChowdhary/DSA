class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode slow=head;
        ListNode fast=head.next;
        
        while(fast!=null){
            if(slow.val==fast.val){
                if(fast.next!=null){
                    fast=fast.next;
                }else{
                    slow.next=null;
                    break;
                }
                
            }else{
                slow.next=fast;
                slow=slow.next;
                fast=fast.next;
            }

        }
        return head;
    }
}
