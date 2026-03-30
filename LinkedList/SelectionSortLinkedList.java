package LinkedList;


import java.util.*;
class SelectionNode {
    int data;
    SelectionNode next;
    SelectionNode(int data){
        this.data=data;
        this.next=null;
    }
}

public class SelectionSortLinkedList {
    SelectionNode head;

    public void add(int data){
        SelectionNode newNode = new SelectionNode(data);
        if(head==null){
            head=newNode;
        }else{
            SelectionNode curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newNode;
        }
    }
    public void selectionsort(){
        for(SelectionNode i=head;i!=null&&i.next!=null;i=i.next){
            SelectionNode min=i;
            for(SelectionNode j=i.next;j!=null;j=j.next){
                if(j.data<min.data){
                    min=j;
                }
            }
            if(min!=i){
                int temp=i.data;
                i.data=min.data;
                min.data=temp;
            }
            
        }
    }
    public void printlist(){
        SelectionNode curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        SelectionSortLinkedList list = new SelectionSortLinkedList();
        list.add(64);
        list.add(25);
        list.add(12);
        list.add(22);
        list.add(11);

        System.out.println("Original List:");
        list.printlist();

        list.selectionsort();

        System.out.println("Sorted List:");
        list.printlist();
    }
}
