package DSA;

public class CustomQueue {
    private int size;
    private int[] queue;
    private int front;
    private int rear;
    public CustomQueue(int size){
        this.size = size;
        queue = new int[size];
        this.front =0;
        this.rear =-1;
    }
    public int enqueue(int element){
        if (isFull()){
            throw new RuntimeException("Queue is full ...");
        }
        queue[++rear]=element;
        return element;
    }
    public int dequeue(){
        if(isEmpty()) {
            throw new RuntimeException("Queue is Empty ...");
        }
        return queue[front++];
    }
    public boolean isFull(){
        return rear == size-1;
    }
    public boolean isEmpty(){
        return front>rear;
    }
    public int peek(){
        if(isEmpty()){
            throw  new RuntimeException("Queue is empty ...");
        }
        return front;

    }
    public int size(){
        return rear-front +1;
    }
}
class QueueMain{
    public static void main(String[] args) {
        CustomQueue cq = new CustomQueue(4);
        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);
        cq.enqueue(4);
        cq.enqueue(5);
        System.out.println(cq.peek());
        System.out.println(cq.isEmpty());
        System.out.println(cq.peek());
        while(!cq.isEmpty()){
            System.out.println(cq.dequeue());
        }
    }
}
