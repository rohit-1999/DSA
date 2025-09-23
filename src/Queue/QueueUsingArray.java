package Queue;

public class QueueUsingArray {
    static int [] Arr;
    static int size;
    static int rear = -1;
    public QueueUsingArray(int size){
        Arr = new int [size];
        this.size=size;
    }
    public boolean isEmpty(){
        return rear==-1;
    }
    public void add(int val) {
        if(rear == Arr.length-1) {System.out.println("Queue is full !!"); return;}
        Arr[++rear] = val;
    }
    public int remove(){

        if(isEmpty()) return -1;
        int front = Arr[0];
        for(int i =0; i<rear;i++){
            Arr[i]=Arr[i+1];
        }
        rear--;
        return front;
    }
    public int peek(){

        if(isEmpty()) return -1;
        return Arr[0];
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
