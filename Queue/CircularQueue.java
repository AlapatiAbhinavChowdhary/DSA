//this is used because after dequeue operation the space is wasted 
class circular{
    int[] queue;
    int front,rear,capacity,size;

    circular(int capacity){
        this.capacity=capacity;
        queue=new int[capacity];
        front =0;
        rear=-1;
        size=0;

    }

    boolean isenpty(){
        return size==0;
    }
    boolean isfull(){
        return size==capacity;
    }
    void enqueue(int data){
        if(isfull()){
            System.out.println("Queue is full");
            return;
        }
        rear=(rear+1)%capacity;
        queue[rear]=data;
        size++;
        System.out.println(data+" enqueued to queue");
    }

    int dequeue(){
        if(isenpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int data=queue[front];
        front=(front+1)%capacity;
        size--;
        return data;
    }
    void display(){
        if(isenpty()){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=0;i<size;i++){
            System.out.println(queue[(front+i)%capacity]);
        }
    }
}

public class circularqueue {
    public static void main(String[] args){
        circular cq=new circular(5);
        cq.enqueue(10);
        cq.enqueue(20); 
        cq.enqueue(30);
        cq.display();
        System.out.println("Dequeued element is: "+cq.dequeue());
        cq.display();
    }
}
