class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class insertionsortlinkedlist{
    Node head;
    public void add(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
        }else{
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newNode;
        }
    }
    public void insertionsort(){
        if(head==null ||head.next==null) return;
        Node sorted=null;
        Node curr=head;
        while(curr!=null){
            Node next = curr.next;
            sorted=sortedInsert(sorted,curr);
            curr=next;
        }
        head=sorted;
    }
    private Node sortedInsert(Node sorted,Node newNode){
        if(sorted ==null || newNode.data<sorted.data){
            newNode=sorted;
            return newNode;

        }
        Node curr =sorted;
        while(curr.next!=null&&curr.next.data<newNode.data){
            curr=curr.next;
        }
        newNode.next=curr.next;
        curr.next=newNode;
        return sorted;
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
        insertionsortlinkedlist list=new insertionsortlinkedlist();
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