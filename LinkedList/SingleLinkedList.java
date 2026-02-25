class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SingleLinkedList {
    Node head;

    public void add(int data){
        Node newNode=new Node(data);
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
    public void display(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public void insertAt(int index,int data){
        Node newNode=new Node(data);
        if(index==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node curr=head;
        for(int i=0;i<index-1 && curr!=null;i++){
            curr=curr.next;

        }
        if(curr==null){
            System.out.println("Index out of bounds");
            return;
        }
        newNode.next=curr.next;
        curr.next=newNode;
    }
    public void delete(int data){
        if(head==null) return;
        if(head.data==data){
            head=head.next;
            return;
        }
        Node curr=head;
        while(curr.next!=null&&curr.next.data!=data){
            curr=curr.next;
        }
        if(curr.next==null){
            System.out.println("Element not found");
            return;
        }
        curr.next=curr.next.next;
    }

    public boolean contains(int data){
        Node curr=head;
        while(curr!=null){
            if(curr.data==data) return true;
            curr=curr.next;
        }
        return false;
    }
    public int size(){
        int count=0;
        Node curr=head;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        return count;
    }
    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Initial List:");
        list.display();

        list.insertAt(1,15);
        System.out.println("After inserting 15 at index 1:");
        list.display();

        list.delete(20);
        System.out.println("After deleting 20:");
        list.display();

        System.out.println("List contains 30? " + list.contains(30));
        System.out.println("Size of the list: " + list.size());
    }
    
}

