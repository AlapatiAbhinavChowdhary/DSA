class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}

public class doublelinkedlist {
    Node head;
    Node tail;
    public void insertatend(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    public void insertatbeginning(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void deletenode(int data){
        if(head==null) return;
        if(head.data==data){
            head=head.next;
            if(head!=null) head.prev=null;
            return;
        }
        if(tail.data==data){
            tail=tail.prev;
            if(tail!=null) tail.next=null;
            return;
        }
        Node temp=head.next;
        while(temp!=null&&temp.data!=data){
            temp=temp.next;
        }
        if(temp==null) return;
        temp.prev.next=temp.next;
        if(temp.next!=null) temp.next.prev=temp.prev;
    }
    public void printlist(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        doublelinkedlist list=new doublelinkedlist();
        list.insertatend(10);
        list.insertatend(20);
        list.insertatbeginning(5);
        list.printlist(); // Output: 5 10 20
        list.deletenode(10);
        list.printlist(); // Output: 5 20
    }
}
