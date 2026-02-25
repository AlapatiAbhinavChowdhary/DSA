class stackarray{
    int top;
    int capacity;
    int[] stack;

    stackarray(int size){
        capacity=size;
        stack=new int[capacity];
        top=-1;

    }
    void push(int data){
        if(isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top]=data;
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;  
        }
        return stack[top];
    }
    boolean isEmpty(){
        return top==-1;
    }
    boolean isFull(){
        return top==capacity-1;
    }
    void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
}
public class stack{
    public static void main(String[] args){
        stackarray s=new stackarray(5);
        s.push(10);
        s.push(20); 
        s.push(30);
        s.display();
        System.out.println("Top element is: "+s.peek());
        System.out.println("Popped element is: "+s.pop());
        s.display();
    }
}













//using built in
// import java.util.stack;
// public class buildinstack{
//     public static void main(String[] args){
//         Stack<Integer> stack=new Stack<>();
//         stack.push(10);
//         stack.push(20);
//         stack.push(30);
//         System.out.println("Stack: "+stack);
//         System.out.println("Top element is: "+stack.peek());
//         System.out.println("Popped element is: "+stack.pop());
//         System.out.println("Stack after pop: "+stack);
//     }
// }




//using linked list
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;

//     }
// }
// class stack{
//     Node top;
//     void push(int data){
//         Node newNode=new Node(data);
//         newNode.next=top;
//         top=newNode;

//     }
//     int pop(){
//         if(top==null){
//             System.out.println("Stack is empty");
//             return -1;
//         }
//         int val=top.data;
//         top=top.next;
//         return val;

//     }
//     int peek(){
//         if(top==null){
//             SYstem.out.println("Stack is empty");
//             return -1;
//         }
//         return top.data;
//     }
//     boolean isEmpty(){
//         return top==null;
//     }
//     void display(){
//         if(top==null){
//             System.out.println("Stack is empty");
//             return;
//         }
//         Node curr=top;
//         while(curr!=null){
//             System.out.println(curr.data);
//             curr=curr.next;
//         }
//     }
// }
// public class stack{
//     public static void main(String[] args){
//         stack s=new stack();
//         s.push(10);
//         s.push(20); 
//         s.push(30);
//         s.display();
//         System.out.println("Top element is: "+s.peek());
//         System.out.println("Popped element is: "+s.pop());
//         s.display();
//     }
// }