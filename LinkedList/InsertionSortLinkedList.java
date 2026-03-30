package LinkedList;


import java.util.*;
class InsertionNode {
    int data;
    InsertionNode next;
    InsertionNode(int data){
        this.data=data;
        this.next=null;
    }
}
public class InsertionSortLinkedList {
    InsertionNode head;
    public void add(int data){
        InsertionNode newNode = new InsertionNode(data);
        if(head==null){
            head=newNode;
        }else{
            InsertionNode curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newNode;
        }
    }
    public void insertionsort(){
        if(head==null ||head.next==null) return;
        InsertionNode sorted=null;
        InsertionNode curr=head;
        while(curr!=null){
            InsertionNode next = curr.next;
            sorted=sortedInsert(sorted,curr);
            curr=next;
        }
        head=sorted;
    }
    private InsertionNode sortedInsert(InsertionNode sorted, InsertionNode newNode){
        if(sorted ==null || newNode.data<sorted.data){
            newNode.next=sorted;
            return newNode;

        }
        InsertionNode curr =sorted;
        while(curr.next!=null&&curr.next.data<newNode.data){
            curr=curr.next;
        }
        newNode.next=curr.next;
        curr.next=newNode;
        return sorted;
    }
    public void printlist(){
        InsertionNode curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        InsertionSortLinkedList list = new InsertionSortLinkedList();
        list.add(64);
        list.add(25);
        list.add(12);
        list.add(22);
        list.add(11);

        System.out.println("Original List:");
        list.printlist();

        list.insertionsort();
        System.out.println("Sorted List:");
        list.printlist();
    }
}