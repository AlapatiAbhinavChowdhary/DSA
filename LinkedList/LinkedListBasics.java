package LinkedList;


import java.util.*;
class BasicListNode {
    int val;
    BasicListNode next;
    BasicListNode(int val){
        this.val=val;
        this.next=null;
    }
}
public class LinkedListBasics {
    public static void main(String[] args) {
        BasicListNode head = new BasicListNode(1);
        head.next = new BasicListNode(2);
        head.next.next = new BasicListNode(3);
        BasicListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
}
