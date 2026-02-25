class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class eveninlinkedlist {
    Node head;
    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;        
        }else{
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    public void displayeven(){
        Node curr=head;
        while(curr!=null){
            if(curr.data%2==0){
                System.out.println(curr.data);
            }
            curr=curr.next;

        }
    }    
    public static void main(String[] args){
        eveninlinkedlist list=new eveninlinkedlist();
        list.add(10);
        list.add(15);   
        list.add(20);
        list.add(25);
        list.add(30);
        System.out.println("Even elements in the linked list:");
        list.displayeven();
    }
}
