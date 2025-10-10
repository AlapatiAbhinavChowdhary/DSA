class Queuearay{
    int [] arr;
    int front;
    int rear;
    int capacity;

    Queuearay(int size){
        arr=new int[size];
        capacity=size;
        front=0;
        rear=-1;
    }

    void enqueue(int data){
        if(rear==capacity-1){
            System.out.println("Queue is full");
            return;
        }
        arr[++rear]=data;

    }
    int dequeue(){
        if(isempty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front++];
    }

    int peek(){
        if(isempty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    boolean isempty(){
        return front>rear;
    }

    void display(){
        if(isempty()){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.println(arr[i]);
    }
}
}



public class queue {
    public static void main(String[] args){
        Queuearay q=new Queuearay(5);
        q.enqueue(10);
        q.enqueue(20); 
        q.enqueue(30);
        q.display();
        System.out.println("Front element is: "+q.peek());
        System.out.println("Dequeued element is: "+q.dequeue());
        q.display();
    }
    
}
