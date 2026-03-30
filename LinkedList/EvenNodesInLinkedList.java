package LinkedList;


import java.util.*;
class EvenNode {
    int data;
    EvenNode next;
    EvenNode(int data){
        this.data=data;
        this.next=null;
    }
}
public class EvenNodesInLinkedList {
    EvenNode head;
    public void add(int data){
        EvenNode newNode = new EvenNode(data);
        if(head==null){
            head=newNode;        
        }else{
            EvenNode temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    public void displayeven(){
        EvenNode curr=head;
        while(curr!=null){
            if(curr.data%2==0){
                System.out.println(curr.data);
            }
            curr=curr.next;

        }
    }    
    public static void main(String[] args){
        EvenNodesInLinkedList list = new EvenNodesInLinkedList();
        list.add(10);
        list.add(15);   
        list.add(20);
        list.add(25);
        list.add(30);
        System.out.println("Even elements in the linked list:");
        list.displayeven();
    }
}
