// Node class
/* class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
} */

// Stack class
class myStack {
    Node head=null;
    int n=0;
    public myStack() {
        // Initialize your data members
        
    }

    public boolean isEmpty() {
        // check if the stack is empty
        if(head==null) return true;
        return false;
    }

    public void push(int x) {
        // Adds an element x at the rear of the stack.
        Node newnode=new Node(x);
        newnode.next=head;
        head=newnode;
        n++;
        
    }

    public void pop() {
        // Removes the front element of the stack.
        head=head.next;
        n--;
    }

    public int peek() {
        // Returns the front element of the stack.
        // If stack is empty, return -1.
        if(head!=null) return head.data;
        return -1;
    }

    public int size() {
        // Returns the current size of the stack.
        return n;
    }
}
