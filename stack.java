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