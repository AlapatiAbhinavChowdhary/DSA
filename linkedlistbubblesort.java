class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class linkedlistbubblesort {
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
    public void bubblesort(){
        if(head==null) return;
        int n=size();
        for(int i=0;i<n-1;i++){
            Node curr=head;
            Node nextNode=head.next;
            for(int j=0;j<n-1-i;j++){
                if(nextNode!=null &&curr.data>nextNode.data){
                    int temp=curr.data;
                    curr.data=nextNode.data;
                    nextNode.data=temp;
                }
                curr=nextNode;
                if(nextNode!=null) nextNode=nextNode.next;
            }
        }
    
    }
    
    
    public int size(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        linkedlistbubblesort list = new linkedlistbubblesort();
        list.add(20);
        list.add(10);   
        list.add(300);
        list.add(50);
        list.add(40);
        System.out.println("Original linked list:");
        list.display();
        list.bubblesort();
        System.out.println("Sorted linked list:");
        list.display();
        
    }
}
