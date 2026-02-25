class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class sumlinkedlist {
    Node head;
    public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public int sum(){
        int sum=0;
        Node curr=head;
        while(curr!=null){
            sum+=curr.data;
            curr=curr.next;

        }
        return sum;
    }
    public static void main(String[] args){
        sumlinkedlist list = new sumlinkedlist();
        list.add(10);
        list.add(20);   
        list.add(30);
        System.out.println("Sum of elements in linked list: "+list.sum());
    }
}
