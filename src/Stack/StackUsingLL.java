package Stack;

import java.util.EmptyStackException;

public class StackUsingLL {
      Node head;
     class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public  boolean isEmpty(){
        return head==null;
    }
    public void push(int val){
        Node newNode = new Node(val);
        if(head==null) {head = newNode; return;}
        newNode.next =head;
        head =newNode;
    }
    public int pop(){
        if(isEmpty()) return -1;
        int top = head.data;
        head = head.next;
        return top;
    }

    public int peek(){
        if(isEmpty()) return -1;
        return head.data;
    }

    public static void main(String[] args) {
        StackUsingLL stack = new StackUsingLL();
       stack.push(1);
       stack.push(2);
       stack.push(3);
        System.out.println(stack.peek());
       while(!stack.isEmpty()){
           System.out.println(stack.peek());
           stack.pop();
       }
       stack.pop();
        System.out.println(" removing fist element and then peek");
        System.out.println(stack.peek());
    }
    }

