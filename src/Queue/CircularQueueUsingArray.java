package Queue;

public class CircularQueueUsingArray {
    static int [] Arr;
    static int size;
    static int rear = -1;
    static int front = -1;
    public CircularQueueUsingArray(int size){
        Arr = new int [size];
        this.size=size;
    }
    public boolean isEmpty(){
        return rear==-1 && front == -1;
    }
    public boolean isFull(){
        return front == (rear+1)%size;
    }
    public void add(int val) {
        if(isFull()) {System.out.println("Queue is full !!"); return;}
        if(front==-1){
            front++;
        }
        rear = (rear+1)%size;
        Arr[rear] = val;
    }
    public int remove(){

        if(isEmpty()) return -1;
        int item = Arr[front];
        if(rear==front) rear = front =-1;
        else front =(front+1)%size;
        return item;
    }
    public int peek(){

        if(isEmpty()) return -1;
        return Arr[front];
    }

    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray(3);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

}
