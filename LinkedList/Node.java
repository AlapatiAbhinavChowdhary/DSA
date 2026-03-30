package LinkedList;


import java.util.*;
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
