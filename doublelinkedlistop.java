// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        next=null;
        prev=null;
    }
}
class Main {
    static Node head=null;
    static Node tail=null;
    public static void insertionatbe(int val){
    Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }  
    public static void insertionatend(int val){
        Node newNode=new Node(val);
        if(tail==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    public static void deletionatbe(){
        if(head==null){
            return;
        }
        if(head==tail){
            head=tail=null;
            return;
        }
        head=head.next;
        head.prev=null;
    }
    public static void deletionatend(){
        if(tail==null){
            return;
        }
        if(head==tail){
            head=tail=null;
            return;
        }
        tail=tail.prev;
        tail.next=null;
    }
    public static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        insertionatbe(10);
        insertionatbe(5);

        insertionatbe(20);
        insertionatend(30);
        display();
        deletionatbe();
        display();

        deletionatend();
        display();
    }
}
