package Stack;


import java.util.*;

// Node class
/* class StackUsingLinkedList {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
} */

// Stack class
class StackNode {
    int data;
    StackNode next;

    StackNode(int data) {
        this.data = data;
    }
}

public class StackUsingLinkedList {
    StackNode head = null;
    int n = 0;

    public StackUsingLinkedList() {
        // Initialize your data members
    }

    public boolean isEmpty() {
        if (head == null) return true;
        return false;
    }

    public void push(int x) {
        StackNode newnode = new StackNode(x);
        newnode.next = head;
        head = newnode;
        n++;
    }

    public void pop() {
        if (head == null) return;
        head = head.next;
        n--;
    }

    public int peek() {
        if (head != null) return head.data;
        return -1;
    }

    public int size() {
        return n;
    }
}
