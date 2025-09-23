package Stack;

import java.util.ArrayList;

public class StackArray {

    ArrayList<Integer> arr = new ArrayList<>();
    public boolean isEmpty(){
        return arr.size()==0;
    }
    public void push(int val){
        arr.add(val);
    }
    public int pop(){
        if(arr.isEmpty()) return -1;
       int top = arr.get(arr.size()-1);
       arr.remove(arr.size()-1);
       return top;
    }
    public int peek(){
        return arr.get(arr.size()-1);
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());

        System.out.println("After deleting one element from stack ");
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }

}
