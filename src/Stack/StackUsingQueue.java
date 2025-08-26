package src.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> queue1 =new  LinkedList<>();
    Queue<Integer> queue2 =new  LinkedList<>();

    public void push(int val){
        while (!queue1.isEmpty()){
            queue2.offer(queue1.poll());
        }
        queue1.offer(val);
        while (!queue2.isEmpty()){
            queue1.offer(queue2.poll());
        }
    }
    public int peek(){
        if (queue1.isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return queue1.peek();
    }
    public int pop(){
        if (queue1.isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return queue1.poll();
    }
    public static void main(String[] args) {
            StackUsingQueue s = new StackUsingQueue();
            s.push(10);
        System.out.println( s.peek());//10
            s.push(20);
            s.push(30);
            s.push(40);
        System.out.println(s.peek());//40
        System.out.println(s.pop());//40
        System.out.println(  s.peek());// 30
    }
}
