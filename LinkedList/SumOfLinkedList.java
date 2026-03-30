package LinkedList;


import java.util.*;
class SumNode {
    int data;
    SumNode next;
    SumNode(int data){
        this.data=data;
        this.next=null;
    }
}

public class SumOfLinkedList {
    SumNode head;
    public void add(int data){
        SumNode newNode = new SumNode(data);
        if(head==null){
            head=newNode;
        }else{
            SumNode temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public int sum(){
        int sum=0;
        SumNode curr=head;
        while(curr!=null){
            sum+=curr.data;
            curr=curr.next;

        }
        return sum;
    }
    public static void main(String[] args){
        SumOfLinkedList list = new SumOfLinkedList();
        list.add(10);
        list.add(20);   
        list.add(30);
        System.out.println("Sum of elements in linked list: "+list.sum());
    }
}
