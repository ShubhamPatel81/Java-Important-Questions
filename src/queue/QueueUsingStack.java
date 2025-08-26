package src.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void  enqueue(int val){
        // move all the elements from stack1 to stack2
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        //insert value in stack 1
        stack1.push(val);
        // move all the elements from stack2 to stack 1
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }
    public int dequeue(){
        if (stack1.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int val = stack2.pop();
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return val;
    }public int peek(){
        if (stack1.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
     return   stack1.peek();
    }
    public static void main(String[] args) {

        QueueUsingStack q  = new QueueUsingStack();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Peek is : "+ q.peek());
        System.out.println("Dequeue is : "+ q.dequeue());
        q.enqueue(7);
        System.out.println("Peek is : "+ q.peek());

    }
}
