/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int n1=0,n2=0;
        ListNode curr1=headA;
        ListNode curr2=headB;
        while(curr1!=null){
            n1++;
            curr1=curr1.next;
        }
        while(curr2!=null){
            n2++;
            curr2=curr2.next;
        }
        int diff=Math.abs(n1-n2);
        if(n1>n2){
            curr1=headA;
            curr2=headB;
        }else{
            curr1=headB;
            curr2=headA;
        }
        for(int i=0;i<diff;i++) curr1=curr1.next;

        while(curr1!=null && curr2!=null){
            if(curr1==curr2) return curr1;
            curr1=curr1.next;
            curr2=curr2.next;
        }
        return null;
    }
}
