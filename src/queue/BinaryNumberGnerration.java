package src.queue;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberGnerration {

    public static void main(String[] args) {
        binaryGen(10);
    }
    static  void  binaryGen(int n){
        Queue<String> q =new LinkedList<>();
        q.add("1");
        for (int i = 0 ; i< n ; i++){
            String temp =q.poll();
            System.out.print(temp + " ");
            q.add(temp+"0");
            q.add(temp +"1");
        }
    }
}
