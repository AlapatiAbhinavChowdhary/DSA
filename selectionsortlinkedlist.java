class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class selectionsortlinkedlist {
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
    public void selectionsort(){
        for(Node i=head;i!=null&&i.next!=null;i=i.next){
            Node min=i;
            for(Node j=i.next;j!=null;j=j.next){
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
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        selectionsortlinkedlist list=new selectionsortlinkedlist();
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
